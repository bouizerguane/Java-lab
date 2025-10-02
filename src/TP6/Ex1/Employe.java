package TP6.Ex1;

abstract class Employe {
    protected String nom;
    protected String prenom;

    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public abstract double calculSalaire();

    public String toString(){
        return "nom : " + nom + " prénom : " + prenom +
                " mon salaire est : " + calculSalaire() + " MAD";
    }

}
