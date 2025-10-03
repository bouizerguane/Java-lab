package TP11.Ex1;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String pathinput ="C:/Users/hp/IdeaProjects/untitled/src/TP11/Ex1/input.txt";
        String pathdata ="C:/Users/hp/IdeaProjects/untitled/src/TP11/Ex1/data.csv";
        //String pathinput ="C:/Users/hp/IdeaProjects/untitled/src/TP11/Ex1/input.txt";
        //String pathinput ="C:/Users/hp/IdeaProjects/untitled/src/TP11/Ex1/input.txt";
        try {
            // Lecture fichier
            System.out.println("=== Lecture input.txt ===");
            TextReader.readLines(pathinput);

            // Copie + résumé
            System.out.println("\n=== Copie avec résumé ===");
            TextWriter.copyWithSummary(pathinput, "output.txt");

            // CSV
            List<Record> all = CsvParser.readCsv(pathdata);
            List<Record> passed = all.stream()
                    .filter(r -> r.getScore() >= 50)
                    .toList();
            CsvParser.writeCsv(passed, "passed.csv");

            // Sérialisation
            ObjectSerializer.serialize(all, "records.ser");
            List<Record> loaded = ObjectSerializer.deserialize("records.ser");
            System.out.println("\n=== Objets désérialisés ===");
            loaded.forEach(System.out::println);

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}

