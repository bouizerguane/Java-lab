package TP14.Ex1;

public class LambdaIntro {
    public static void main(String[] args) {

        Calculateur addition = (a, b) -> a + b;

        System.out.println("Addition avec lambda: " + addition.calculer(5, 3));
    }
}
