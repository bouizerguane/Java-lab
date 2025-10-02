package TP4.Ex2;

public class Reptile extends Animal {
    private String typeEcailles;

    public Reptile(String nom, int age, String typeEcailles) {
        super(nom, age);
        this.typeEcailles = typeEcailles;
    }
    public String getTypeEcailles() {
        return typeEcailles;
    }

    public void seChauffer(){
        System.out.println(getNom() + " se chauffe au soleil");
    }

    public String toString(){
        return super.toString() + "typeEcailles: " + typeEcailles;
    }

}

