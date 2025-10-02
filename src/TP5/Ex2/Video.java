package TP5.Ex2;

public class Video extends Media{

    private String resolution;

    public Video(String titre, int duree, String resolution){
        super(titre, duree);
        this.resolution = resolution;
    }

    public void lire(){
        System.out.println("lecture de la vidéo " + titre + " avec une résolution de : " + resolution);
    }



}
