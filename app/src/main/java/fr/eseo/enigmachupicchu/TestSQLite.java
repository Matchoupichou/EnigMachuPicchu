package fr.eseo.enigmachupicchu;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

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
        String titre = "Titre TEST";
        String enonce = "- Mieux que Dieu\n-Pire que le diable\n-Les pauvres en ont\n-Les riches en ont besoin\n-Si on en mange, on meurt";
        String reponse = "Rien";
        int difficulte = 1;
        int resolue = 0;

        enigme.setTitre(titre);
        enigme.setEnonce(enonce);
        enigme.setSolution(reponse);
        enigme.setDifficulte(difficulte);
        enigme.setResolue(resolue);

        //On ouvre la base de données pour écrire dedans
        enigmesBdd.open();
        //On insère l'énigme que l'on vient de créer
        enigmesBdd.insertEnigme(enigme);

        //Pour vérifier que l'on a bien créé notre énigme dans la BDD
        //on extrait l'énigme de la BDD grâce au titre de l'énigme que l'on a créé précédemment
        Enigme enigmeFromBdd = enigmesBdd.getEnigmeWithId(enigme.getId());
        //Si une énigme est retournée (donc si l'énigme à bien été ajoutée à la BDD)
        if(enigmeFromBdd != null){
            //On affiche les infos de l'énigme dans un Toast
            Toast.makeText(this, enigmeFromBdd.toString(), Toast.LENGTH_LONG).show();
            //On modifie le titre de l'énigme
            enigmeFromBdd.setTitre("L'énigme de Stanford");
            //Puis on met à jour la BDD
            enigmesBdd.updateEnigme(enigmeFromBdd.getId(), enigmeFromBdd);
        }

        //On essaie d'extraire de l'énigme de la BDD
        enigmeFromBdd = enigmesBdd.getEnigmeWithId(enigme.getId());
        //Si aucune énigme n'est retournée
        if(enigmeFromBdd == null){
            //On affiche un message indiquant que l'énigme n'existe pas dans la BDD
            Toast.makeText(this, "Cette énigme n'existe pas dans la BDD", Toast.LENGTH_LONG).show();
        }
        //Si l'énigme existe (mais normalement il ne devrait pas)
        else{
            //on affiche un message indiquant que le livre existe dans la BDD
            Toast.makeText(this, "Ce livre existe dans la BDD", Toast.LENGTH_LONG).show();
        }

        enigmesBdd.close();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_test_sqlite, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}