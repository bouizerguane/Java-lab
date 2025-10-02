package TP6.Ex1;

public class EmployeHoraire extends Employe{
    private double tauxHoraire;
    private double heuresTravaillees;

    public EmployeHoraire(String nom, String prenom, double tauxHoraire, double heuresTravaillees) {
        super(nom, prenom);
        this.tauxHoraire = tauxHoraire;
        this.heuresTravaillees = heuresTravaillees;
    }

    @Override
    public double calculSalaire() {
        return tauxHoraire * heuresTravaillees;
    }


}
