package org.example;


import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        System.out.println("Exercice 2");
        Scanner lecteur = new Scanner(System.in);

        System.out.print("Combien de lignes pour votre triangle ? : ");
        int hauteur = lecteur.nextInt();

        for (int i = 1; i <= hauteur; i++) {

            for (int j = 1; j <= hauteur - i; j++) {
                System.out.print(" ");
            }


            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        lecteur.close();

    }
}