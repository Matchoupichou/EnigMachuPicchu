package fr.eseo.enigmachupicchu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

import fr.eseo.enigmachupicchu.fr.eseo.enigmachupicchu.sqlite.Enigme;
import fr.eseo.enigmachupicchu.fr.eseo.enigmachupicchu.sqlite.EnigmesBDD;


/**
 * Created by sirt on 03/02/2015.
 */
public class ActiviteQuestion extends Activity {
    ScrollView vue = null;
    //LinearLayout layout = null;
    String titreRecupere = null;
    String enonceRecupere = null;
    String solutionRecuperee = null;
    int idEnigmerecupere = -1;
    int difficulteRecuperee = -1;
    TextView titre = null;
    TextView enonce = null;
    TextView reponseUtilisateur = null;
    TextView resultat = null;
    private Button boutonValider = null;
    Context contextActuel = null;
    ArrayList<Enigme> listeEnigmes;
    Bundle bundle= null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        bundle=this.getIntent().getExtras();
        titreRecupere=bundle.getString("titre");
        enonceRecupere=bundle.getString("enonce");
        enonceRecupere = "\n" + enonceRecupere;
        solutionRecuperee=bundle.getString("solution");
        idEnigmerecupere = bundle.getInt("id");
        difficulteRecuperee = bundle.getInt("level");
        contextActuel = this;
        super.onCreate(savedInstanceState);
        //layout = (LinearLayout) LinearLayout.inflate(this, R.layout.activite_question, null);
        vue = (ScrollView) ScrollView.inflate(this, R.layout.activite_question, null);
        //setContentView(layout);
        setContentView(vue);
        resultat = (TextView)findViewById(R.id.resultatQ);
        titre = (TextView)findViewById(R.id.titreQ);
        enonce = (TextView)findViewById(R.id.enonceQ);
        reponseUtilisateur = (TextView)findViewById(R.id.reponseUtilisateurQ);
        titre.setText(titreRecupere);
        enonce.setText(enonceRecupere);

        boutonValider = (Button)findViewById(R.id.validerQ);


        boutonValider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String resultatUtilisateurTemp = reponseUtilisateur.getText().toString();
                String message = new String();
                if(!resultatUtilisateurTemp.isEmpty()){
                    if(resultatUtilisateurTemp.toLowerCase().equals(solutionRecuperee.toLowerCase())){
                        message = "Résultat CORRECT..  =)";
                        EnigmesBDD bdd = new EnigmesBDD(contextActuel);
                        bdd.open();
                        Enigme enigme = bdd.getEnigmeWithId(idEnigmerecupere);
                        enigme.setResolue(1);
                        bdd.updateEnigme(idEnigmerecupere,enigme);
                        bdd.close();
                        //Bundle bundle = new Bundle();
                        //bundle.putArrayList("listeEnigmes",listeEnigmes);
                        ImageView imageTemp = (ImageView) vue.findViewById(R.id.imageQ);
                        imageTemp.setImageResource(R.drawable.ic_check);
                    } else {
                        message = " Résultat INCORRECT..  -.-'";
                        ImageView imageTemp2 = (ImageView) vue.findViewById(R.id.imageQ);
                        imageTemp2.setImageResource(R.drawable.ic_trollface);
                    }
                    resultat.setText(message);
                } else {
                    message = "Veuillez entrer une réponse avant de valider..";
                }
            }
        });



    }
}