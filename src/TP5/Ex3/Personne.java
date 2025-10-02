package TP5.Ex3;

abstract class Personne {
    protected final String nom;
    protected final double salaire;

    public Personne(String nom, double salaire){
        this.nom = nom;
        this.salaire = salaire;
    }

    public abstract double calculSalaire();

    public void affiche() {
        System.out.printf(
                "Je suis %s, salaire = %.2f%n",
                nom, calculSalaire()
        );

    }

}
