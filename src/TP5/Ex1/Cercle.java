package TP5.Ex1;

public class Cercle extends Forme {
    private double rayon;

    public Cercle(String couleur, double rayon) {
        super(couleur);
        this.rayon = rayon;
    }

    @Override
    public void dessiner() {
        System.out.println("Cercle de couleur " + couleur + " son rayon est : " + rayon);
    }

    @Override
    public double aire() {
        return Math.PI * rayon * rayon;
    }
}
