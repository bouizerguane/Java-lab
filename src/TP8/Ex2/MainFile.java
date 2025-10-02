package TP8.Ex2;

import java.util.List;

public class MainFile {
    public static void main(String[] args) {
        // Appel de la méthode de lecture sur "numbers.txt"
        List<Integer> nums = FileUtil.readNumbers("C:/Users/hp/IdeaProjects/untitled/src/TP8/Ex2/numbers.txt");

        // Affichage simple du résultat
        System.out.println("Nombres lus : " + nums);
    }
}
