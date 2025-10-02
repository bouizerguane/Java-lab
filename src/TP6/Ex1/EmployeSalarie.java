package TP6.Ex1;

public class EmployeSalarie extends Employe{
    private double salaireMensuel;

    public EmployeSalarie(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaireMensuel = salaire;
    }

    @Override
    public double calculSalaire() {
        return salaireMensuel;
    }
}
