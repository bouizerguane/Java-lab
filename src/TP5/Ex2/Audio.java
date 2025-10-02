package TP5.Ex2;

public class Audio extends Media{

    public Audio(String titre, int duree){
        super(titre, duree);
    }

    public void lire(){
        System.out.println("lecture de l'audio " + titre);

    }

}
