package fr.eseo.enigmachupicchu;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import fr.eseo.enigmachupicchu.fr.eseo.enigmachupicchu.sqlite.Enigme;
import fr.eseo.enigmachupicchu.fr.eseo.enigmachupicchu.sqlite.EnigmesBDD;

public class QuestionActivity extends  Activity {

    public int level;
    ArrayAdapter<String> adapter;
    ArrayList<String> listItems=new ArrayList<String>();
    public QuestionActivity(){
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        Bundle ob=this.getIntent().getExtras();
        int numeroLevel=ob.getInt("Level");
       // System.out.println("je suis le level"+numeroLevel);
        EnigmesBDD bdd=new  EnigmesBDD(this);
        ArrayList<Enigme> enigmes=bdd.fenigmes(bdd.enigmes(numeroLevel));
        //int id=R.id.listeTitres;
        //this.adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,this.titreEnigmes(enigmes));
       // Toast.makeText(this,"je sus le level : "+numeroLevel,Toast.LENGTH_LONG).show();
      //setListAdapter(adapter);
    }



    public ArrayList<String> titreEnigmes(ArrayList<Enigme> enigmes){
        ArrayList<String> titres=new ArrayList<String>();
        for(int k=0;k<enigmes.size();k++){
           titres.add(enigmes.get(k).getTitre());
       }
        return titres;
    }
}
