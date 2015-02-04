package fr.eseo.enigmachupicchu.fr.eseo.enigmachupicchu.sqlite;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import fr.eseo.enigmachupicchu.fr.eseo.enigmachupicchu.sqlite.Enigme;
import fr.eseo.enigmachupicchu.fr.eseo.enigmachupicchu.sqlite.EnigmesBDD;


public class FillDatabase  {


    public static void exec(Context context){


        //Création d'une instance de ma classe EnigmesBDD
        EnigmesBDD enigmesBdd = new EnigmesBDD(context);
        enigmesBdd.open();
        //Création des énigmes
        /*<-------------------------------------- niveau 1 -------------------------------------->*/
        Enigme enigme = new Enigme("L’énigme de Stanford", "Cette énigme fut posée aux étudiants " +
                "de l'université de Stanford lors d'une épreuve de réflexion.\n" +
                "\n" + "C'est mieux que Dieu.\n" + "C'est pire que le Diable.\n"
                + "Les pauvres en ont.\n" + "Les riches en ont besoin.\n"
                + "Et si on en mange, on meurt.\n" + "\n"
                + "Qu'est ce que c'est ?", "Rien",1);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Le verre d'eau",
                "Combien peut-on mettre de gouttes d'eau dans un verre vide ?","1",1);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Le nénuphar géant","Un nénuphar se trouvant dans un lac double " +
                "de taille chaque jour. Au bout de 10 jours, il couvre la moitié du lac.\n" +
                "Combien de jours lui aura-t-il fallu en tout pour le recouvrir entièrement ?",
                "11",1);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("La prescription","Votre médecin vous a donné un traitement de " +
                "trois gélules. Il faut en prendre une toutes les demi-heures.\n" +
                "Quelle est la durée du traitement (en minutes) ?","60",1);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Le père et le fils","Un père a 30 ans de plus que son fils. " +
                "Le père et le fils ont à eux deux 36 ans.\n" +
                "Quel est l'âge du père ?","33",1);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Le fumeur chevronné","Sachant que l'on a besoin de 3 mégots " +
                "(reste de cigarette) pour faire 1 cigarette, " +
                "combien peut-on fumer de cigarettes en ayant 10 cigarettes au début ?","14",1);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("La lettre suivante","Quelle est la lettre suivante de cette suite :\n"
                + "J - F - M - A - M - J - J - ?","A",1);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Les canards","Deux canards se trouvent devant un canard, " +
                "deux canards se trouvent derrière un canard et un canard est au milieu.\n" +
                "Combien y a-t-il de canards au minimum ?","3",1);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Les chaussettes","Dans un tiroir se trouvent 24 chaussettes rouges " +
                "et 24 chaussettes vertes. " + "La pièce étant plongée dans le noir, " +
                "combien faudra-t-il prendre de chaussettes au minimum pour " +
                "être sûr d'avoir une paire de la même couleur ?","3",1);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Le petit frère","David a 10 ans, son petit frère Franck a la " +
                "moitié de son âge. Quand David sera 10 fois plus âgé, " +
                "quel âge aura Franck ?","95",1);
        enigmesBdd.insertEnigme(enigme);
        /*<-------------------------------------- niveau 2 -------------------------------------->*/
        enigme = new Enigme("La grande ponte","1000 poules pondent 1000 oeufs en 10 jours.\n" +
                "Combien 500 poules pondent d'oeufs en 5 jours ? " +
                "(On suppose qu'elles ne mettent pas 10 jours à pondre un oeuf)","250",2);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("L'énigme du Sphinx","Cette énigme a été posée par le Sphinx " +
                "à Oedipe arrivant à la ville de Thèbes.\n" +
                "Qu'est ce qui a 4 pattes le matin, 2 le midi et 3 le soir ?","L'homme",2);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("La suite logique","Trouvez l'étape suivante de cette suite logique :\n"
                + "1\n" + "11\n" + "21\n" + "1211\n" + "111221\n" + "312211","13112221",2);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("L'escargot glisseur","Un escargot est tombé dans un puits de 10m " +
                "de profondeur et essaye de le remonter.\n" +
                "Chaque jour il monte de 3 mètres et glisse de 2 mètres pendant la nuit.\n" +
                "Combien de jours va-t-il lui falloir pour remonter à la surface ?","8",2);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Calcul de produit","Quel est le résultat de ce produit :\n" +
                "(x - a)(x - b)(x - c)....(x - z) ?\n" +
                "Le produit s'étend avec les 26 lettres de l'alphabet, celles-ci étant " +
                "des nombres réels.","0",2);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Le groupe de filles","Dans un groupe de filles,\n" +
                "70% portent un pull bleu,\n" +
                "75% portent un pantalon bleu,\n" +
                "85% portent un chapeau bleu,\n" +
                "85% portent un manteau bleu.\n" +
                "Quel pourcentage minimum de filles ne portent que des vêtements bleus ?","15",2);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Composant temporel",
                "Il n'y en a qu'un seul dans une minute, deux dans une heure. " +
                        "Mais aucun dans un jour.\n" +
                        "Qui suis-je ?", "e", 2);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("L'église",
                "Me rendant à l'église ce dimanche, j'ai croisé 1 homme et 7 femmes, " +
                        "chaque femme possédant 1 sac à main, chaque sac à main " +
                        "contenant une chatte, chaque chatte possédant 7 chatons.\n" +
                        "Combien de personnes vont à la messe ?", "1", 2);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("La souris","Vous possédez une souris depuis 1 an.\n" +
                "Sachant qu'une souris peut produire 18 souris chaque mois à partir de 2 mois, " +
                "combien posséderez-vous de souris au bout de 10 mois ?","1",2);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Les chapeaux",
                "3 hommes entrent dans une pièce noire et choisissent chacun un chapeau parmi " +
                        "un lot de 3 noirs et 2 blancs. Ils ressortent de la pièce en file indienne " +
                        "sans pouvoir voir la couleur de leur propre chapeau. " +
                        "Ils ne peuvent regarder que ceux qui sont devant eux.\n" +
                        "On demande au dernier s'il peut dire la couleur du sien et répond que 'non'. " +
                        "La même question est posée à celui du milieu qui répond également 'non'. " +
                        "Le premier de la file, n'ayant vu aucun chapeau, répond qu'il connait " +
                        "la couleur du sien.\n" +
                        "Quelle est la couleur du chapeau du premier de la file ?","noir",2);
        enigmesBdd.insertEnigme(enigme);
        /* <-------------------------------------- niveau 3 ------------------------------------->*/
        enigme = new Enigme("La peinture murale",
                "Stéphanie veut faire peindre son mur, elle connait 3 personnes qui pourraient le faire.\n" +
                        "Frank peut peindre un mur en 1h, Jacques en 3h et Léon en 6h. " +
                        "Seulement elle est pressée et les embauche tous les 3. " +
                        "Combien de temps (en minutes) vont-ils mettre à eux 3 ?","40",3);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Le dromadaire",
                "Un dromadaire doit transporter un maximum de bananes d'une oasis à " +
                        "une autre distantes de 1000km.\nIl dispose de 3000 bananes mais ne peut " +
                        "en transporter plus de 1000 à chaque voyage.\nDe plus, pour survivre à son voyage, " +
                        "il mangera 1 banane à chaque kilomètre parcouru.\n" +
                        "Combien de bananes peut-il transporter à la deuxième oasis ?","533",3);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Les 3 filles",
                "Un homme faisant connaissance avec sa voisine apprend qu'elle a 3 filles.\n" +
                        "Intrigué, il lui demande leurs âges, mais ne voulant pas répondre directement " +
                        "elle préfère lui faire deviner :\n" +
                        "Le produit de leurs âges fait 36.\n" +
                        "Il me faudrait plus d'indices.\n" +
                        "La somme est égale au numéro de la maison d'en face.\n" +
                        "Je ne peux toujours pas trouver.\n" +
                        "L'ainée est blonde.\n" +
                        "Ah oui je vois.\n" +
                        "Quel est l'âge de l'aînée ?","9",3);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Le tunnel",
                "Bernadette court dans un tunnel.\n" +
                        "Arrivée aux 3/8 du chemin, elle entend le sifflet d'un train venant derrière elle.\n" +
                        "Elle sait que le train roule toujours à 60 km/h sur cette portion de la voie.\n" +
                        "Elle fait un calcul mental rapide : elle peut éviter le train de justesse :\n" +
                        "Si elle court vers l'entrée du tunnel,\n" +
                        "Si elle court vers la sortie.\n" +
                        "A quelle vitesse (en km/h) court Bernadette ?","15",3);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Le pharmacien",
                "Le pharmacien n'a eu que 4 clientes aujourd'hui.\n" +
                        "Malheureusement, il a mélangé toutes les factures.\n" +
                        "Il ne se souvient que de très peu de choses de la journée :\n" +
                        "Denise, qui est venue avant Yvette a acheté un sirop contre la toux.\n" +
                        "La deuxième cliente, qui n'est pas Jeannine, a pris de l'aspirine.\n" +
                        "Juste avant celle qui a acheté des cigarettes à l'eucalyptus, Yvette a acheté une brosse à dents.\n" +
                        "Quel fût le produit acheté par Ginette chez son pharmacien ?","Aspirine",3);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Les pyramides",
                "A l'époque des Égyptiens, on transportait les pierres grâce à des rondins de bois. " +
                        "Soit une pierre de 10m de long sur 1m de large, posée sur 10 rondins. " +
                        "Chaque rondin fait exactement un mètre de circonférence.\n" +
                        "Lorsque les rondins auront parcouru 1m, quelle distance aura parcouru la pierre (en mètres)?","2",3);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Les diviseurs",
                "Soit un nombre composé de neufs chiffres distincts (de 1 à 9) disposés de telle sorte que :\n" +
                        "le premier chiffre soit divisible par un,\n" +
                        "le nombre formé des deux premiers chiffres soit divisible par deux,\n" +
                        "le nombre formé par les trois premiers chiffres divisible par trois,\n" +
                        "et ainsi de suite jusqu'à 9.\n" +
                        "\n" +
                        "Quel est ce nombre ?","381654729",3);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("Le sommelier",
                "Un patron demande d'avoir plus de précisions sur les notes de son sommelier.\n" +
                        "Celui-ci lui a indiqué :\n" +
                        "- 2 tonneaux remplissent 11 petits verres et 6 grands.\n" +
                        "- 3 tonneaux remplissent 20 petits verres et 7 grands.\n" +
                        "\n" +
                        "Ce soir, il lui a dit avoir servi 9 petits verres et 44 grands verres.\n" +
                        "\n" +
                        "Combien de tonneaux ont été servis ?","8",3);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("L'élection",
                "Un maire a été élu parmi 4 candidats au cours d'une élection où 6217 personnes " +
                        "ont voté (aucun bulletin blanc).\nIl a eu 25 voix de plus que le deuxième, " +
                        "40 de plus que le troisième et 70 de plus que le quatrième.\n" +
                        "Combien de voix le maire a-t-il obtenu ?","1588",3);
        enigmesBdd.insertEnigme(enigme);
        enigme = new Enigme("La pierre",
                "Sur un lac se trouve une barque sur laquelle il y a un énorme rocher. " +
                        "Le capitaine jette ce rocher à l'eau.\n" +
                        "Que devient le niveau de l'eau du lac ?","baisse",3);
        enigmesBdd.insertEnigme(enigme);

        enigmesBdd.close();
    }
}
