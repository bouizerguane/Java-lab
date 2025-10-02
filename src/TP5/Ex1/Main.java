package TP5.Ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Forme> formes = new ArrayList<Forme>();

        formes.add(new Cercle("rouge", 12));
        formes.add(new Rectangle("vert", 14, 18));
        formes.add(new Triangle("bleu", 34, 65));
        formes.add(new Carre("jaune", 25));

        for (Forme forme : formes) {
            forme.dessiner();
        }

        for (Forme forme : formes) {
            System.out.println("la surface du " + forme.getClass().getSimpleName() + " est: " + forme.aire());
        }

    }
}
