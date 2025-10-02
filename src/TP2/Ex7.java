package TP2;

import java.util.*;

public class Ex7 {
    public static int majAbsolue(int[] tab) {
        int n = tab.length;
        int can = -1, compt = 0;

        for (int x : tab) {
            if (compt == 0) {
                can = x;
                compt = 1;
            } else if (x == can) {
                compt++;
            } else {
                compt--;
            }
        }

        compt = 0;
        for (int x : tab) {
            if (x == can) compt++;
        }

        if (compt > n / 2) return can;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau : ");
        int n = sc.nextInt();

        int[] tab = new int[n];
        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < n; i++) {
            tab[i] = sc.nextInt();
        }

        int resultat = majAbsolue(tab);
        if (resultat == -1) {
            System.out.println("Aucun élément majoritaire.");
        } else {
            System.out.println("L'élément majoritaire est : " + resultat);
        }
    }
}

