package TP6.Ex1;

public class Entreprise {
    private Employe[] employes;
    private int nb;

    public Entreprise() {
        employes = new Employe[4];
        this.nb = 0;
    }

    public void ajoutEmploye(Employe emp) {
        if(this.nb == this.employes.length) {
            Employe[] temp = new Employe[this.employes.length*2];
            System.arraycopy(this.employes, 0, temp, 0, this.employes.length);
            this.employes = temp;
        }
        employes[this.nb++] = emp;
    }

    public void affichePaie(){
        double somme = 0.0;
        System.out.println("------- Bulletin de paie --------");
        for(int i=0; i<this.nb; i++){
            System.out.println(this.employes[i]);
            somme +=  this.employes[i].calculSalaire();
        }
        System.out.println("Masse salariée totale : " + somme + " $" );
    }
}
