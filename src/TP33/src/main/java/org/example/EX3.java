package org.example;


import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        System.out.println("Exercice 3");
        Scanner lecteur = new Scanner(System.in);

        System.out.print("Combien de valeurs : ");
        int n = lecteur.nextInt();

        long[] carres = new long[n];
        int[] impairs = new int[n];

        for (int i = 0; i < n; i++) {
            int nombreImpair = 2 * i + 1;
            impairs[i] = nombreImpair;
            carres[i] = (long) nombreImpair * nombreImpair;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(impairs[i] + " a pour carre " + carres[i]);
        }

        lecteur.close();
    }
}