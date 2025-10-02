package TP6.Ex1;

public class Main {
    public static void main(String[] args) {
        Entreprise e1 = new Entreprise();

        e1.ajoutEmploye(new EmployeHoraire("salmi", "ahmed", 25, 200));
        e1.ajoutEmploye(new Vendeur("guirou", "said", 10000, 400));
        e1.ajoutEmploye(new EmployeSalarie("marco", "said", 20000));

        e1.affichePaie();

    }
}
