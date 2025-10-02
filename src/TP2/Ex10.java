package TP2;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int[][] mat = new int[n][n];

        System.out.println("Entrez les éléments de la matrice 3x3 :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        boolean magique = true;

        // première ligne
        int sommeAttendue = 0;
        for (int j = 0; j < n; j++) {
            sommeAttendue += mat[0][j];
        }

        // autres lignes
        for (int i = 1; i < n; i++) {
            int sommeLigne = 0;
            for (int j = 0; j < n; j++) {
                sommeLigne += mat[i][j];
            }
            if (sommeLigne != sommeAttendue) {
                magique = false;
                break;
            }
        }

        // les colonnes
        if (magique) {
            for (int j = 0; j < n; j++) {
                int sommeCol = 0;
                for (int i = 0; i < n; i++) {
                    sommeCol += mat[i][j];
                }
                if (sommeCol != sommeAttendue) {
                    magique = false;
                    break;
                }
            }
        }

        // les diagonales
        if (magique) {
            int diag1 = mat[0][0] + mat[1][1] + mat[2][2];
            int diag2 = mat[0][2] + mat[1][1] + mat[2][0];
            if (diag1 != sommeAttendue || diag2 != sommeAttendue) {
                magique = false;
            }
        }

        if (magique) {
            System.out.println("La matrice est un carré magique !");
        } else {
            System.out.println("La matrice n'est pas un carré magique.");
        }
    }
}

