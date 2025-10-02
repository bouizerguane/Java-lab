package TP8.Ex1;

public class MainCalc {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        try {
            // Tentative d'une division valide
            System.out.println("10 / 2 = " + calc.division(10, 2));

            // Tentative d'une division par zéro → déclenche ArithmeticException
            System.out.println("10 / 0 = " + calc.division(10, 0));

        } catch (ArithmeticException ex) {
            // Capturer l'exception et afficher le message d’erreur
            System.err.println("Erreur de calcul : " + ex.getMessage());

        } finally {
            // Ce bloc s'exécute toujours, que l'exception soit levée ou non
            System.out.println("Fin du calcul.");
        }

        try {
            //Tentative d'un racine carre valide
            System.out.println("Racine carré de 25 est : " + calc.racineCarre(25));

            //Tentative d'un racine carre non valide
            System.out.println("Racine carré de -25 est : " + calc.racineCarre(-25));
        } catch (ArithmeticException ex) {
            System.err.println("Erreur de calcul : " + ex.getMessage());
        }finally {
            System.out.println("Fin du calcul.");
        }

    }
}
