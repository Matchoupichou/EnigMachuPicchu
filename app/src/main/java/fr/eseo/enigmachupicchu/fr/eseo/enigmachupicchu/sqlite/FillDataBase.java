package fr.eseo.enigmachupicchu.fr.eseo.enigmachupicchu.sqlite;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import fr.eseo.enigmachupicchu.fr.eseo.enigmachupicchu.sqlite.Enigme;
import fr.eseo.enigmachupicchu.fr.eseo.enigmachupicchu.sqlite.EnigmesBDD;


public class FillDataBase  {


    public static void exec(Context context){


        //Création d'une instance de ma classe EnigmesBDD
        EnigmesBDD enigmesBdd = new EnigmesBDD(context);
        enigmesBdd.open();
        //Création des énigmes
        Enigme enigme = new Enigme("TEST RESOLUE", "TEST TEST TEST", "TEST",1,1);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("TEST NON RESOLUE", "TEST TEST TEST NON RESOLUE", "TEST",1,0);
        enigmesBdd.insertEnigme(enigme);
        /* <--------------------------------------------- niveau 1 --------------------------------------------->*/
        /*Enigme enigme = new Enigme("L’énigme de Stanford", "Cette énigme fut posée aux étudiants de l'université de Stanford lors d'une épreuve de réflexion.\n" +
                "\n" + "C'est mieux que Dieu.\n" + "C'est pire que le Diable.\n" + "Les pauvres en ont.\n" +
                "Les riches en ont besoin.\n" + "Et si on en mange, on meurt.\n" + "\n" + "Qu'est ce que c'est ?",
                "Rien",1,1);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Le verre d'eau","Combien peut-on mettre de gouttes d'eau dans un verre vide ?","1",1,1);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Le nénuphar géant","Un nénuphar se trouvant dans un lac double de taille chaque jour. Au bout de 10 jours, il couvre la moitié du lac.\n" +
                "Combien de jours lui aura-t-il fallu en tout pour le recouvrir entièrement ?","11",1,1);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("La prescription","Votre médecin vous a donné un traitement de trois gélules. Il faut en prendre une toutes les demi-heures.\n" +
                "Quelle est la durée du traitement (en minutes) ?","60",1,1);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Le père et le fils","Un père a 30 ans de plus que son fils. Le père et le fils ont à eux deux 36 ans.\n" +
                "Quel est l'âge du père ?","33",1);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Le fumeur chevronné","Sachant que l'on a besoin de 3 mégots (reste de cigarette) pour faire 1 cigarette, " +
                "combien peut-on fumer de cigarettes en ayant 10 cigarettes au début ?","14",1);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("La lettre suivante","Quelle est la lettre suivante de cette suite :\n" +
                "J - F - M - A - M - J - J - ?","A",1);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Les canards","Deux canards se trouvent devant un canard, deux canards se trouvent derrière un canard et un canard est au milieu.\n" +
                "Combien y a-t-il de canards au minimum ?","3",1);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Les chaussettes","Dans un tiroir se trouvent 24 chaussettes rouges et 24 chaussettes vertes. " +
                "La pièce étant plongée dans le noir, combien faudra-t-il prendre de chaussettes au minimum pour être sûr d'avoir une paire de la même couleur ?","3",1);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Le petit frère","David a 10 ans, son petit frère Franck a la moitié de son âge. Quand David sera 10 fois plus âgé, quel âge aura Franck ?","95",1);
        enigmesBdd.insertEnigme(enigme);*/
        /* <--------------------------------------------- niveau 2 --------------------------------------------->*/
        /*enigme = new Enigme("La grande ponte","1000 poules pondent 1000 oeufs en 10 jours.\n" +
                "Combien 500 poules pondent d'oeufs en 5 jours ? (On suppose qu'elles ne mettent pas 10 jours à pondre un oeuf)","250",2);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("L'énigme du Sphinx","Cette énigme a été posée par le Sphinx à Oedipe arrivant à la ville de Thèbes.\n" +
                "Qu'est ce qui a 4 pattes le matin, 2 le midi et 3 le soir ?","L'homme",2);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("La suite logique","Trouvez l'étape suivante de cette suite logique :\n" +
                "1\n" + "11\n" + "21\n" + "1211\n" + "111221\n" + "312211","13112221",2);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("L'escargot glisseur","Un escargot est tombé dans un puits de 10m de profondeur et essaye de le remonter.\n" +
                "Chaque jour il monte de 3 mètres et glisse de 2 mètres pendant la nuit.\n" +
                "Combien de jours va-t-il lui falloir pour remonter à la surface ?","8",2);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Calcul de produit","Quel est le résultat de ce produit :\n" +
                "(x - a)(x - b)(x - c)....(x - z) ?\n" +
                "Le produit s'étend avec les 26 lettres de l'alphabet, celles-ci étant des nombres réels.","0",2);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Le groupe de filles","Dans un groupe de filles,\n" +
                "70% portent un pull bleu,\n" +
                "75% portent un pantalon bleu,\n" +
                "85% portent un chapeau bleu,\n" +
                "85% portent un manteau bleu.\n" +
                "Quel pourcentage minimum de filles ne portent que des vêtements bleus ?","15",2);*/
        /* <--------------------------------------------- niveau 3 --------------------------------------------->*/

        enigmesBdd.close();
    }
}
