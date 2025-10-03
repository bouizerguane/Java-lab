package TP10.Ex2;

import java.util.Arrays;
import java.util.List;

public class Triplet<A, B, C> {
    private final A premier;
    private final B deuxieme;
    private final C troisieme;

    public Triplet(A premier, B deuxieme, C troisieme) {
        this.premier = premier;
        this.deuxieme = deuxieme;
        this.troisieme = troisieme;
    }

    public A getPremier() {
        return premier;
    }
    public B getDeuxieme() {
        return deuxieme;
    }
    public C getTroisieme() {
        return troisieme;
    }

    void afficher() {
        System.out.println("TripletH : [" + premier + ", " + deuxieme + ", " + troisieme + "]");
    }
    public List<Object> toList() {
        return Arrays.asList(premier, deuxieme, troisieme);
    }

}
