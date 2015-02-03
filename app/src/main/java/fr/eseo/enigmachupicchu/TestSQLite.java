package fr.eseo.enigmachupicchu;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import fr.eseo.enigmachupicchu.fr.eseo.enigmachupicchu.sqlite.EnigmesBDD;
import fr.eseo.enigmachupicchu.fr.eseo.enigmachupicchu.sqlite.Enigme;


public class TestSQLite extends Activity {


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Création d'une instance de ma classe EnigmesBDD
        EnigmesBDD enigmesBdd = new EnigmesBDD(this);

        //Création d'une énigme
        Enigme enigme = new Enigme();
        enigme.setTitre("L'énigme de Stanford");
        enigme.setEnonce("- Mieux que Dieu\n-Pire que le diable\n-Les pauvres en ont\n-Les riches en ont besoin\n-Si on en mange, on meurt");
        enigme.setSolution("Rien");
        enigme.setDifficulte(1);
        enigme.setResolue(0);

        //On ouvre la base de données pour écrire dedans
        enigmesBdd.open();
        //On insère l'énigme que l'on vient de créer
        //enigmesBdd.insertEnigme(enigme);

        /*enigme.setTitre("Le verre d'eau");
        enigme.setEnonce("Combienpeut-on mettre de goutte dans unverre vide?");
        enigme.setSolution("1");
        enigme.setDifficulte(1);
        enigme.setResolue(0);

        //On insère l'énigme que l'on vient de créer
        enigmesBdd.insertEnigme(enigme);*/

        /*enigme.setTitre("Suite logique");
        enigme.setEnonce("Lettre suivante à : J-F-M-A-M-J-J-?");
        enigme.setSolution("A");
        enigme.setDifficulte(2);
        enigme.setResolue(0);

        //On insère l'énigme que l'on vient de créer
        enigmesBdd.insertEnigme(enigme);*/

        /*enigme.setTitre("Addition");
        enigme.setEnonce("Quelle est le résultat de la moitié de 2 + 2 ?");
        enigme.setSolution("3");
        enigme.setDifficulte(3);
        enigme.setResolue(0);

        //On insère l'énigme que l'on vient de créer
        enigmesBdd.insertEnigme(enigme);*/

        //Pour vérifier que l'on a bien créé notre énigme dans la BDD
        //on extrait l'énigme de la BDD grâce au titre de l'énigme que l'on a créé précédemment
        //Enigme enigmeFromBdd = enigmesBdd.getEnigmeWithId(enigme.getId());
        //Si une énigme est retournée (donc si l'énigme à bien été ajoutée à la BDD)
        //if(enigmeFromBdd != null){
            //On affiche les infos de l'énigme dans un Toast
        //    Toast.makeText(this, enigmeFromBdd.toString(), Toast.LENGTH_LONG).show();
            //On modifie le titre de l'énigme
        //    enigmeFromBdd.setTitre("L'énigme de Stanford");
            //Puis on met à jour la BDD
        //    enigmesBdd.updateEnigme(enigmeFromBdd.getId(), enigmeFromBdd);
        //}

        //On essaie d'extraire de l'énigme de la BDD
        //enigmeFromBdd = enigmesBdd.getEnigmeWithId(enigme.getId());
        //Si aucune énigme n'est retournée
        //if(enigmeFromBdd == null){
            //On affiche un message indiquant que l'énigme n'existe pas dans la BDD
        //    Toast.makeText(this, "Cette énigme n'existe pas dans la BDD", Toast.LENGTH_LONG).show();
        //}
        //Si l'énigme existe (mais normalement il ne devrait pas)
        //else{
            //on affiche un message indiquant que le livre existe dans la BDD
            Toast.makeText(this, "Ce livre existe dans la BDD", Toast.LENGTH_LONG).show();
        //}

        Toast.makeText(this, "ENIGMES SIMPLES", Toast.LENGTH_LONG).show();
        ArrayList<Enigme> enigmes=enigmesBdd.fenigmes(enigmesBdd.enigmes(1));
        for(int k=0;k<enigmes.size();k++){
            Toast.makeText(this, enigmes.get(k).getEnonce(), Toast.LENGTH_LONG).show();
        }
        Toast.makeText(this, "ENIGMES MOYENNES", Toast.LENGTH_LONG).show();
        enigmes=enigmesBdd.fenigmes(enigmesBdd.enigmes(2));
        for(int k=0;k<enigmes.size();k++){
            Toast.makeText(this, enigmes.get(k).getEnonce(), Toast.LENGTH_LONG).show();
        }
        Toast.makeText(this, "ENIGMES DURES", Toast.LENGTH_LONG).show();
        enigmes=enigmesBdd.fenigmes(enigmesBdd.enigmes(3));
        for(int k=0;k<enigmes.size();k++){
            Toast.makeText(this, enigmes.get(k).getEnonce(), Toast.LENGTH_LONG).show();
        }
        enigmesBdd.close();
    }

}