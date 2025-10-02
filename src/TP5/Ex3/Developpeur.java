package TP5.Ex3;

public class Developpeur extends Personne {
    public Developpeur(String nom, double salaire) {
        super(nom, salaire);
    }

    public double calculSalaire(){
        return salaire*1.1;
    }


}
