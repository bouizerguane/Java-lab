package TP5.Ex3;

public class Manager extends Personne{

    public Manager(String nom, double salaire){
        super(nom, salaire);
    }

    @Override
    public double calculSalaire() {
        return salaire*1.3;
    }
}
