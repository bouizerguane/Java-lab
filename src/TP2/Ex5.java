package TP2;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int n = sc.nextInt();
        int[] t = new int[n];

        System.out.println("Entrez les éléments du tableau :");
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }

        // Vérifier la présence des nombres 1 à n
        boolean[] present = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            if (t[i] < 1 || t[i] > n) {
                System.out.println("Le tableau contient un nombre hors de 1 à n.");
                return;
            }
            present[t[i]] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                System.out.println("Le tableau ne contient pas tous les nombres de 1 à n.");
                return;
            }
        }

        // Chercher 1
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (t[i] == 1) {
                pos = i;
                break;
            }
        }

        // Vérifier la permutation
        boolean valid = true;
        for (int i = 0; i < n; i++) {
            int k = (i % n) + 1;
            if (t[(pos + i) % n] != k) {
                valid = false;
                break;
            }
        }

        if (valid) {
            System.out.println("Le tableau est une permutation circulaire valide.");
        } else {
            System.out.println("Le tableau n'est pas une permutation circulaire.");
        }

    }
}
