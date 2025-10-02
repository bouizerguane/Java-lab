package TP5.Ex2;

import java.util.Arrays;

public class MediaLibrary {
    private Media[] medias;
    private int compteur;

    public MediaLibrary(){
        medias = new Media[5];
        compteur = 0;
    }

    public void addMedia(Media m){
        if(compteur == medias.length){
            medias = Arrays.copyOf(medias,medias.length*2);
        }
        medias[compteur++] = m;
    }

    public void playAll(){
        for(int i = 0; i < compteur; i++){
            medias[i].lire();
        }
    }

}
