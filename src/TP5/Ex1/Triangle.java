package TP5.Ex1;

public class Triangle extends Forme {

    private double hauteur, base;

    public Triangle(String couleur, double hauteur, double base) {
        super(couleur);
        this.hauteur = hauteur;
        this.base = base;
    }

    @Override
    public void dessiner() {
        System.out.println("Triangle de couleur " + couleur + " avec dimensions : " + hauteur + " et "+base);
    }

    @Override
    public double aire() {
       return (base * hauteur) / 2.0;
    }
}
