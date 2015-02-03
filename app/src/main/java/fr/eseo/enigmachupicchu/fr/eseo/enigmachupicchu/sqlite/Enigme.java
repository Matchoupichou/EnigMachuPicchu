package fr.eseo.enigmachupicchu.fr.eseo.enigmachupicchu.sqlite;

/**
 * Created by 'Dim on 02/02/2015.
 */
public class Enigme {
    private int id;
    private String titre;
    private String enonce;
    private String solution;
    private int difficulte;
    private int resolue;

    public Enigme(){}

    public Enigme(String titre, String enonce, String solution){
        this.titre = titre;
        this.enonce = enonce;
        this.solution = solution;
        this.difficulte = 1;
        this.resolue = 0;
    }

    public Enigme(String titre, String enonce, String solution, int difficulte, int resolue){
        this.titre = titre;
        this.enonce = enonce;
        this.solution = solution;
        this.difficulte = difficulte;
        this.resolue = resolue;
    }

    public int getId() { return this.id; }
    public void setId(int id){ this.id = id; }

    public String getTitre() { return this.titre; }
    public void setTitre(String titre){ this.titre = titre; }

    public String getEnonce() { return this.enonce; }
    public void setEnonce(String enonce){ this.enonce = enonce; }

    public String getSolution() { return this.solution; }
    public void setSolution(String solution){ this.solution = solution; }

    public int getDifficulte() { return this.difficulte; }
    public void setDifficulte(int difficulte){ this.difficulte = difficulte; }

    public int getResolue() { return this.resolue; }
    public void setResolue(int id){ this.resolue = resolue; }

    public String toString()
    {
        return "ID : "+id+"\ntitre"+titre+"\nenonce : "+enonce+"\nsolution : "+solution+"\n : difficulte"+difficulte+"\n : resolue"+resolue;
    }
}
