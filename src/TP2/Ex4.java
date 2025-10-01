package TP2;

import java.util.Random;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Entrez la taille de la matrice : ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = rand.nextInt(2);
            }
        }

        System.out.println("Matrice binaire aléatoire :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        int surfaceMax = 0;
        int ligneHautGauche = 0, colonneHautGauche = 0;
        int ligneBasDroite = 0, colonneBasDroite = 0;

        // former les rectangles
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (mat[i][j] == 1) {

                    int largeurMin = n;

                    for (int ligneFin = i; ligneFin < n; ligneFin++) {

                        if (mat[ligneFin][j] == 0) break;

                        int largeur = 0;
                        while (j + largeur < n && mat[ligneFin][j + largeur] == 1) {
                            largeur++;
                        }

                        if (largeur < largeurMin) largeurMin = largeur;

                        int surface = largeurMin * (ligneFin - i + 1);

                        if (surface > surfaceMax) {
                            surfaceMax = surface;
                            ligneHautGauche = i;
                            colonneHautGauche = j;
                            ligneBasDroite = ligneFin;
                            colonneBasDroite = j + largeurMin - 1;
                        }
                    }
                }
            }
        }

        // Affichage du résultat
        System.out.println("\nPlus grand rectangle de 1 :");
        System.out.println("Surface = " + surfaceMax);
        System.out.println("Coin supérieur gauche : (" + ligneHautGauche + "," + colonneHautGauche + ")");
        System.out.println("Coin inférieur droit : (" + ligneBasDroite + "," + colonneBasDroite + ")");

    }
}

