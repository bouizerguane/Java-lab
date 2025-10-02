package TP6.Ex1;

public class Vendeur extends EmployeSalarie{
    private double commission;

    public Vendeur(String nom, String prenom, double salaireMensuel, double commission) {
        super(nom, prenom, salaireMensuel);
        this.commission = commission;
    }

    @Override
    public double calculSalaire() {
        return super.calculSalaire()+commission;
    }


}
