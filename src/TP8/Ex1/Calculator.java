package TP8.Ex1;

import static java.lang.Math.sqrt;

public class Calculator {
    //Additionne a & b
    public double addition(double a, double b) {
        return a + b;
    }

    //Soustrait a & b
    public double soustraction(double a, double b) {
        return a - b;
    }

    //Multiplie a & b
    public double multiplication(double a, double b) {
        return a * b;
    }

    // Divise a par b
    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro impossible");
        }
        return a / b;
    }

    //racine carre de a
    public double racineCarre(double a){
        if (a<0){
            throw new ArithmeticException("Racine Carre impossible, le nombre donné est négatif");
        }
        return sqrt(a);
    }

}
