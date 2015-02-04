package fr.eseo.enigmachupicchu.fr.eseo.enigmachupicchu.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by 'Dim on 02/02/2015.
 */
public class EnigmesBDD {
    private static final int VERSION_BDD = 11;
    private static final String NOM_BDD = "enigmachupicchu.db";

    private static final String TABLE_ENIGMES = "table_enigmes";
    private static final String COL_ID = "ID";
    private static final int NUM_COL_ID = 0;
    private static final String COL_TITRE = "Titre";
    private static final int NUM_COL_TITRE = 1;
    private static final String COL_ENONCE = "Enonce";
    private static final int NUM_COL_ENONCE = 2;
    private static final String COL_SOLUTION = "Solution";
    private static final int NUM_COL_SOLUTION = 3;
    private static final String COL_DIFFICULTE = "Difficulte";
    private static final int NUM_COL_DIFFICULTE = 4;
    private static final String COL_RESOLUE = "Resolue";
    private static final int NUM_COL_RESOLUE = 5;

    private SQLiteDatabase bdd;

    private BaseSQLite maBaseSQLite;

    public EnigmesBDD(Context context){
        //On créer la BDD et sa table
        maBaseSQLite = new BaseSQLite(context, NOM_BDD, null, VERSION_BDD);
    }

    public void open(){
        //on ouvre la BDD en écriture
        bdd = maBaseSQLite.getWritableDatabase();
    }

    public void close(){
        //on ferme l'accès à la BDD
        bdd.close();
    }

    public SQLiteDatabase getBDD(){
        return bdd;
    }

    public long insertEnigme(Enigme enigme){
        //Création d'un ContentValues (fonctionne comme une HashMap)
        ContentValues values = new ContentValues();
        //on lui ajoute une valeur associé à une clé (qui est le nom de la colonne dans laquelle on veut mettre la valeur)
        values.put(COL_TITRE, enigme.getTitre());
        values.put(COL_ENONCE, enigme.getEnonce());
        values.put(COL_SOLUTION, enigme.getSolution());
        values.put(COL_DIFFICULTE, enigme.getDifficulte());
        values.put(COL_RESOLUE, enigme.getResolue());
        //on insère l'objet dans la BDD via le ContentValues
        return bdd.insert(TABLE_ENIGMES, null, values);
    }

    public int updateEnigme(int id, Enigme enigme){
        //La mise à jour d'une enigme dans la BDD fonctionne plus ou moins comme une insertion
        //il faut simple préciser quelle enigme on doit mettre à jour grâce à l'ID
        ContentValues values = new ContentValues();
        values.put(COL_TITRE, enigme.getTitre());
        values.put(COL_ENONCE, enigme.getEnonce());
        values.put(COL_SOLUTION, enigme.getSolution());
        values.put(COL_DIFFICULTE, enigme.getDifficulte());
        values.put(COL_RESOLUE, enigme.getResolue());
        return bdd.update(TABLE_ENIGMES, values, COL_ID + " = " +id, null);
    }

    public int removeEnigmeWithID(int id){
        //Suppression d'une enigme de la BDD grâce à l'ID
        return bdd.delete(TABLE_ENIGMES, COL_ID + " = " +id, null);
    }

    public ArrayList<Enigme> getEnigmeWithDifficulte(int difficulte){
        ArrayList<Enigme> enigmes = new ArrayList<Enigme>();
        /*
         *  TODO
         */
        return enigmes;
    }

    public Enigme getEnigmeWithId(int id){
        //Récupère dans un Cursor les valeur correspondant à une énigme contenue dans la BDD (ici on sélectionne l'énigme grâce à son titre)
        Cursor c = bdd.query(TABLE_ENIGMES, new String[] {COL_ID, COL_TITRE, COL_ENONCE, COL_SOLUTION, COL_DIFFICULTE, COL_RESOLUE}, COL_ID + " = \"" + id +"\"", null, null, null, null);

        return cursorToEnigme(c);
    }

    //Cette méthode permet de convertir un cursor en une énigme
    private Enigme cursorToEnigme(Cursor c){
        //si aucun élément n'a été retourné dans la requête, on renvoie null
        if (c.getCount() == 0)
            return null;

        //Sinon on se place sur le premier élément
        c.moveToFirst();
        //On créé une énigme
        Enigme enigme = new Enigme();
        //on lui affecte toutes les infos grâce aux infos contenues dans le Cursor
        enigme.setId(c.getInt(NUM_COL_ID));
        enigme.setTitre(c.getString(NUM_COL_TITRE));
        enigme.setEnonce(c.getString(NUM_COL_ENONCE));
        enigme.setSolution(c.getString(NUM_COL_SOLUTION));
        enigme.setDifficulte(c.getInt(NUM_COL_DIFFICULTE));
        enigme.setResolue(c.getInt(NUM_COL_RESOLUE));
        //On ferme le cursor
        c.close();

        //On retourne l'énigme
        return enigme;
    }

    public  ArrayList<Enigme> fenigmes(Cursor curs){
       ArrayList<Enigme> enigmes= new ArrayList<Enigme>();
        Enigme enigme= new Enigme();
        while (curs.moveToNext()){
             enigme = new Enigme();
            //on lui affecte toutes les infos grâce aux infos contenues dans le Cursor
            enigme.setId(curs.getInt(NUM_COL_ID));
            enigme.setTitre(curs.getString(NUM_COL_TITRE));
            enigme.setEnonce(curs.getString(NUM_COL_ENONCE));
            enigme.setSolution(curs.getString(NUM_COL_SOLUTION));
            enigme.setDifficulte(curs.getInt(NUM_COL_DIFFICULTE));
            enigme.setResolue(curs.getInt(NUM_COL_RESOLUE));
            enigmes.add(enigme);
        }
        curs.close();
        return enigmes;
    }

    public Cursor enigmes(int difficulte){
        Cursor res;
       res= bdd.query(TABLE_ENIGMES, new String[] {COL_ID, COL_TITRE, COL_ENONCE, COL_SOLUTION, COL_DIFFICULTE, COL_RESOLUE},COL_DIFFICULTE + " = \"" + difficulte +"\"", null, null, null, null);
       return res;
    }


}