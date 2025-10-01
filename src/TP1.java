import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TP1 {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double moyenne(int... valeurs) {
        int total = 0;
        for (int v : valeurs) {
            total += v;
        }
        return (double) total / valeurs.length;
    }

    public static int grandnombre(int... valeurs) {
        int max = valeurs[0];
        for (int v : valeurs) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println("=== MENU PRINCIPAL ===");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Moyenne");
        System.out.println("4. Trouver le plus grand");
        System.out.println("0. Quitter");

        Scanner sc = new Scanner(System.in);
        int choix;
        do {
            System.out.print("Choisir une option: ");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    System.out.print("Entrez deux entiers : ");
                    System.out.print("Nombre 1 : ");
                    int a1 = sc.nextInt();
                    System.out.print("Nombre 2 : ");
                    int b1 = sc.nextInt();
                    System.out.println("La somme est : " + addition(a1, b1));
                    break;

                case 2:
                    System.out.print("Entrez deux entiers : ");
                    System.out.print("Nombre 1 : ");
                    int a2 = sc.nextInt();
                    System.out.print("Nombre 2 : ");
                    int b2 = sc.nextInt();
                    System.out.println("Le produit est : " + multiplication(a2, b2));
                    break;

                case 3:
                    System.out.print("Combien de valeurs ? ");
                    int n = sc.nextInt();
                    int[] valeurs = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Valeur " + (i + 1) + " : ");
                        valeurs[i] = sc.nextInt();
                    }
                    System.out.println("la moyenne est : " + moyenne(valeurs));
                    break;

                case 4:
                    System.out.print("Combien de nombres ? ");
                    int m = sc.nextInt();
                    int[] entiers = new int[m];
                    for (int i = 0; i < m; i++) {
                        System.out.print("Nombre " + (i + 1) + " : ");
                        entiers[i] = sc.nextInt();
                    }
                    System.out.println("le maximum est  : " + grandnombre(entiers));
                    break;

                case 0:
                    System.out.println("Fin du programme.");
                    break;

                default:
                    System.out.println("Option invalide !");
            }
        }while (choix != 0);
    }
}