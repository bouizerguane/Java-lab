package TP4.Ex2;

public class Main {
    public static void main(String[] args) {
        Zoo monZoo = new Zoo();

        monZoo.ajouterAnimal(new Mammifere("lion", 5, "Dorée"));
        monZoo.ajouterAnimal(new Oiseau("Aigle", 3, 2.3));
        monZoo.ajouterAnimal(new Reptile("Crocodile", 12, "Épaisse"));
        monZoo.ajouterAnimal(new Mammifere("Girafe", 7, "Tachetée"));
        monZoo.ajouterAnimal(new Oiseau("Perroquet", 2, 0.4));
        monZoo.ajouterAnimal(new Reptile("Serpent", 4, "Lisse"));


        Animal a1 = new Animal("tigre", 2);
        monZoo.ajouterAnimal(a1);
        monZoo.afficherTous();



    }
}
