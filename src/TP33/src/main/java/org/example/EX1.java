package org.example;


import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        System.out.println("Exercice 1");
        Scanner lecteur = new Scanner(System.in);

        System.out.print("Entrez la valeur de n : ");
        int n = lecteur.nextInt();

        double somme = 0.0;

        for (int i = 1; i <= n; i++) {
            somme = somme + (1.0 / i);
        }

        System.out.println("La somme des " + n + " premiers termes est : " + somme);

        lecteur.close();

    }
}