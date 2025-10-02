package TP4.Ex2;

public class Mammifere extends Animal {
    private String couleurFourrure;

    public Mammifere(String nom, int age, String couleurFourrure) {
        super(nom, age);
        this.couleurFourrure = couleurFourrure;
    }

    public void allaiter(){
        System.out.println(getNom() + "allaiter ses petits");
    }

    public String toString(){
        return super.toString() + "couleurFourrure=" + couleurFourrure;
    }

}
