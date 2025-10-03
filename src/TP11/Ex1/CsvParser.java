package TP11.Ex1;

import java.io.*;
import java.util.*;
import java.nio.file.*;

public class CsvParser {

    public static List<Record> readCsv(String path) throws IOException {
        List<Record> records = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(Path.of(path))) {
            String line;
            br.readLine(); // skip header if present
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length == 3) {
                    int id = Integer.parseInt(tokens[0]);
                    String name = tokens[1];
                    double score = Double.parseDouble(tokens[2]);
                    records.add(new Record(id, name, score));
                }
            }
        }
        return records;
    }

    public static void writeCsv(List<Record> records, String path) throws IOException {
        try (BufferedWriter bw = Files.newBufferedWriter(Path.of(path))) {
            bw.write("id,name,score");
            bw.newLine();
            for (Record r : records) {
                bw.write(r.toString());
                bw.newLine();
            }
        }
    }
}
