package org.example;


public class EX4 {
    public static void main(String[] args) {
        System.out.println("Exercice 4");
        double[][] m1 = {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0}
        };

        double[][] m2 = {
                {10.0, 20.0, 30.0},
                {40.0, 50.0, 60.0}
        };

        double[][] mIrreguliere = {
                {1.0, 2.0},
                {3.0, 4.0, 5.0}
        };

        System.out.println("--- Affichage de m1 ---");
        TableauUtil.affiche(m1);

        System.out.println("\nm1 est régulier ? " + TableauUtil.regulier(m1));
        System.out.println("mIrreguliere est régulier ? " + TableauUtil.regulier(mIrreguliere));

        System.out.println("\n--- Somme des lignes de m1 ---");
        double[] sLignes = TableauUtil.sommeLignes(m1);
        for (double s : sLignes) System.out.print(s + " | ");
        System.out.println();

        System.out.println("\n--- Somme de m1 + m2 ---");
        double[][] mSomme = TableauUtil.somme(m1, m2);
        if (mSomme != null) {
            TableauUtil.affiche(mSomme);
        } else {
            System.out.println("Matrices incompatibles.");
        }

    }
}
