package TP2;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int n = sc.nextInt();

        int[] tab = new int[n];

        System.out.println("Entrez les éléments du tableau : :");
        for (int i = 0; i < n; i++) {
            tab[i] = sc.nextInt();
        }

        boolean[] present = new boolean[n + 1];

        for (int i : tab) {
            if (i >= 1 && i <= n) {
                present[i] = true;
            }
        }

        System.out.println("Nombres absents :");
        boolean manquant = false;
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
                manquant = true;
            }
        }

        if (!manquant) {
            System.out.println("Aucun nombre manquant !");
        }
    }
}
