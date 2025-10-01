package TP2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        //Remplir le tableau
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez les éléments du tableau séparés par des espaces :");
        String[] nombres = sc.nextLine().split(" ");
        int n = nombres.length;

        //Convertir le tableau en int
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = Integer.parseInt(nombres[i]);
        }

        //Créer le tableau d contenant la longueur des sous-suites
        int[] d = new int[n];
        Arrays.fill(d, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (t[i] > t[j]) {
                    d[i] = Math.max(d[i], d[j] + 1);
                }
            }
        }

        int maxLength = 0;
        for (int len : d) {
            if (len > maxLength) maxLength = len;
        }

        System.out.println("Longueur de la plus longue sous-suite croissante : " + maxLength);

    }
}

