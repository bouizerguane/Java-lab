package TP5.Ex1;

public class Carre extends Rectangle {

    public Carre(String couleur, double cote) {
        super(couleur, cote,cote);
    }

    public void dessiner(){
        System.out.println("Carre de couleur " + couleur + " avec cote : " + super.largeur);
    }

}
