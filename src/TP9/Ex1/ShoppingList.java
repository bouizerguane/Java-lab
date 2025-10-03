package TP9.Ex1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    List<String> items = new ArrayList<>();

    public void add(String item){
        items.add(item);
        System.out.println(item + " ajouté");
    }

    public boolean remove(String item){
        boolean sup = items.remove(item);
        if (sup){
            System.out.println(item + " supprimé avec succés");
        }else {
            System.out.println(item + " non trouvé");
        }
        return sup;
    }

    public boolean contain(String item){
        boolean trouve = items.contains(item);
        if (trouve){
            System.out.println(item + " présent dans la liste");
        }else {
            System.out.println(item + " n'est pas dans la liste");
        }
        return trouve;
    }

    public void display(){
        System.out.println("-------- votre liste -------");

        if  (items.isEmpty()){
            System.out.println("votre liste est vide");
        }else {
            for (String item : items) {
                System.out.println(item);
            }
        }
    }

}
