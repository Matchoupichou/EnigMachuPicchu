package fr.eseo.enigmachupicchu;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import fr.eseo.enigmachupicchu.fr.eseo.enigmachupicchu.sqlite.FillDatabase;
public class ActiviteDifficulte extends ActionBarActivity {

    RelativeLayout rlayout = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //FillDatabase.exec(this);
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activite_difficulte);

        rlayout = (RelativeLayout) RelativeLayout.inflate(this, R.layout.activite_difficulte, null);
        setContentView(rlayout);
        ImageView imageTemp = (ImageView) rlayout.findViewById(R.id.imageDifficulte);
        imageTemp.setImageResource(R.drawable.ic_challgengeaccepted);

    }

    public void executeLevel1(View view){
        Intent a=new Intent(this,ActiviteSelectionEnigme.class);
        Bundle obj = new Bundle();
        obj.putInt("Level",1);
        a.putExtras(obj);
        startActivity(a);
    }

    public void executeLevel2(View view){
        Intent a=new Intent(this,ActiviteSelectionEnigme.class);
        Bundle obj = new Bundle();
        obj.putInt("Level",2);
        a.putExtras(obj);
        startActivity(a);
    }

    public void executeLevel3(View view){
        Intent a=new Intent(this,ActiviteSelectionEnigme.class);
        Bundle obj = new Bundle();
        obj.putInt("Level",3);
        a.putExtras(obj);
        startActivity(a);
    }
}
