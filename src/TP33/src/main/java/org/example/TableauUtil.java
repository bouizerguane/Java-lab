package org.example;

public class TableauUtil {

    // 1. Affiche les valeurs de t ligne par ligne
    public static void affiche(double[][] t) {
        if (t == null) return;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + "  ");
            }
            System.out.println(); // Saut de ligne après chaque ligne du tableau
        }
    }

    // 2. Teste si toutes les lignes ont la même taille
    public static boolean regulier(double[][] t) {
        if (t == null || t.length == 0) return true;
        int tailleReference = t[0].length;
        for (int i = 1; i < t.length; i++) {
            if (t[i].length != tailleReference) {
                return false;
            }
        }
        return true;
    }

    // 3. Renvoie un tableau contenant la somme de chaque ligne
    public static double[] sommeLignes(double[][] t) {
        if (t == null) return null;
        double[] sommes = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            double cumul = 0;
            for (int j = 0; j < t[i].length; j++) {
                cumul += t[i][j];
            }
            sommes[i] = cumul;
        }
        return sommes;
    }

    // 4. Renvoie la somme de deux matrices si elles sont compatibles
    public static double[][] somme(double[][] t1, double[][] t2) {
        // Vérifications de base (nullité et régularité)
        if (t1 == null || t2 == null) return null;
        if (!regulier(t1) || !regulier(t2)) return null;

        // Vérification des dimensions (Lignes et Colonnes)
        if (t1.length != t2.length || t1[0].length != t2[0].length) {
            return null;
        }

        int nbLignes = t1.length;
        int nbCol = t1[0].length;
        double[][] resultat = new double[nbLignes][nbCol];

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbCol; j++) {
                resultat[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return resultat;
    }
}