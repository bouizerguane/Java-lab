package TP2;

import java.util.*;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int n = sc.nextInt();

        int[] tab = new int[n];
        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < n; i++) {
            tab[i] = sc.nextInt();
        }

        int sommeCourant = tab[0];
        int sommeMax = tab[0];

        for (int i = 1; i < n; i++) {
            sommeCourant = Math.max(tab[i], sommeCourant + tab[i]);
            sommeMax = Math.max(sommeMax, sommeCourant);
        }

        System.out.println("La somme maximale d’un sous-tableau est : " + sommeMax);
    }
}
