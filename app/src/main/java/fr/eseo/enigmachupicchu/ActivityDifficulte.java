package fr.eseo.enigmachupicchu;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import fr.eseo.enigmachupicchu.fr.eseo.enigmachupicchu.sqlite.Enigme;
import fr.eseo.enigmachupicchu.fr.eseo.enigmachupicchu.sqlite.EnigmesBDD;

public class ActivityDifficulte extends  Activity implements AdapterView.OnItemClickListener {
    ArrayList<Enigme> enigmes;
    public int level;
    ArrayAdapter<String> adapter;
    ArrayList<String> listItems=new ArrayList<String>();
    public ActivityDifficulte(){
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        Bundle ob=this.getIntent().getExtras();
        int numeroLevel=ob.getInt("Level");

        EnigmesBDD bdd=new  EnigmesBDD(this);
        bdd.open();
        enigmes=bdd.fenigmes(bdd.enigmes(numeroLevel));
        ListView a=(ListView)findViewById(R.id.listView);
        this.adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,this.titreEnigmes(enigmes));
        a.setAdapter(this.adapter);
        a.setOnItemClickListener(this);
    }



    public ArrayList<String> titreEnigmes(ArrayList<Enigme> enigmes){
        ArrayList<String> titres=new ArrayList<String>();
        for(int k=0;k<enigmes.size();k++){
           if(enigmes.get(k).getResolue()!=1){
               titres.add(enigmes.get(k).getTitre());
           }else{
               titres.add(enigmes.get(k).getTitre());
           }

       }
        return titres;
    }

    public void onItemClick(AdapterView<?> l, View v, int position, long id) {

       String res= (String)l.getItemAtPosition(position);
        Enigme enigme=this.rechercheEnigme(res);
        Intent a=new Intent(this,ActiviteQuestion.class);
        Bundle obj = new Bundle();
        obj.putString("titre",enigme.getTitre());
        obj.putString("enonce",enigme.getEnonce());
        obj.putString("solution",enigme.getSolution());
        a.putExtras(obj);
        startActivity(a);
    }

    public Enigme rechercheEnigme(String titre){
        Enigme res=null;
        boolean v=true;
        int i=0;

        while(v && i<this.enigmes.size()) {
            if (this.enigmes.get(i).getTitre().equals(titre)) {
                res = this.enigmes.get(i);
            }
        }
        return res;
    }

}
