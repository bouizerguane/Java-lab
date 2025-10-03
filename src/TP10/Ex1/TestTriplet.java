package TP10.Ex1;

public class TestTriplet {
    public static void main(String[] args) {
        Triplet<Integer> tInt = new Triplet<>(1, 2, 3);
        tInt.afficher();  // affiche [1, 2, 3]

        Triplet<String> tStr = new Triplet<>("A", "B", "C");
        tStr.afficher();  // affiche [A, B, C]

        System.out.println("Second élément de tInt : " + tInt.getDeuxieme());
    }
}
