package TP5.Ex1;

public class Rectangle extends Forme {
    protected double largeur;
    private double hauteur;

    public Rectangle(String couleur, double largeur, double hauteur) {
        super(couleur);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public void dessiner(){
        System.out.println("Rectangle de couleur " + couleur + " avec dimensions : " + hauteur + " et "+largeur);
    }

    @Override
    public double aire() {
        return hauteur * largeur;
    }

}
