package TP2;

import java.util.Scanner;

public class Ex2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Entrez les éléments du tableau séparés par des espaces :");
            String[] nombres = sc.nextLine().split(" ");
            int n = nombres.length;
            int[] t = new int[n];
            for (int i = 0; i < n; i++) {
                t[i] = Integer.parseInt(nombres[i]);
            }

            System.out.print("Pivots : ");

            for (int i = 0; i < n; i++) {
                boolean gauche = true;
                boolean droite = true;

                for (int j = 0; j < i; j++) {
                    if (t[j] > t[i]) {
                        gauche = false;
                        break;
                    }
                }

                for (int j = i+1; j < n; j++) {
                    if (t[j] < t[i]) {
                        droite = false;
                        break;
                    }
                }

                if (gauche && droite) {
                    System.out.print(t[i] + " ");
                }
            }

        }
    }

