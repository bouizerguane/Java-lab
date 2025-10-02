package TP5.Ex2;

public class Media {
    protected String titre;
    protected int duree;

    public Media(String titre, int duree) {
        this.titre = titre;
        this.duree = duree;
    }

    public void lire(){
        System.out.println("lecture du media " + titre);
    }

    public String toString() {
        return "titres est: " + titre + " - duree de : " + duree + " s";
    }


}
