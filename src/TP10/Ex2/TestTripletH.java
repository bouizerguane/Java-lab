package TP10.Ex2;

public class TestTripletH {
    public static void main(String[] args) {
        // Exemple 1 : Integer, String, Double
        Triplet<Integer,String,Double> th = new Triplet<>(42, "Answer", 3.14);
        th.afficher();
        System.out.println("Liste des éléments : " + th.toList());

        // Exemple 2 : String, Integer, Boolean
        Triplet<String, Integer, Boolean> th2 = new Triplet<>("Alice", 30, true);
        th2.afficher();
        System.out.println("Liste des éléments : " + th2.toList());
    }
}

