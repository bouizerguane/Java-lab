package TP2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la taille de la matrice n : ");
        int n = sc.nextInt();

        int[][] matrice = new int[n][n];
        int haut = 0, bas = n-1, droit = n-1, gauche = 0;
        int num = 1;

        while (haut <= bas && gauche <= droit) {
            for (int j = gauche; j <= droit; j++) {
                matrice[haut][j] = num;
                num++;
            }
            haut++;

            for (int i = haut; i <= bas; i++) {
                matrice[i][bas] = num;
                num++;
            }
            droit--;

            if (haut <= bas) {
                for (int j = droit; j >= gauche; j--) {
                    matrice[bas][j] = num;
                    num++;
                }
                bas--;
            }

            if (gauche <= droit) {
                for (int i = bas; i >= haut; i--) {
                    matrice[i][gauche] = num;
                    num++;
                }
                gauche++;
            }
        }

        // Affichage de la matrice
        System.out.println("Matrice spirale :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }


    }


    }