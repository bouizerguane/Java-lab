package TP10.Ex1;

public class Triplet <T>{
    private final T premier;
    private final T deuxieme;
    private final T troisieme;

    public Triplet(T premier, T deuxieme, T troisieme) {
        this.premier = premier;
        this.deuxieme = deuxieme;
        this.troisieme = troisieme;
    }

    public T getPremier() {
        return premier;
    }
    public T getDeuxieme() {
        return deuxieme;
    }
    public T getTroisieme() {
        return troisieme;
    }

    void afficher() {
        System.out.println("Premier: " + premier);
        System.out.println("Deuxieme: " + deuxieme);
        System.out.println("Troisieme: " + troisieme);
    }


}
