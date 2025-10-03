package TP11.Ex1;

import java.io.Serializable;

public class Record implements Serializable {
    private int id;
    private String name;
    private double score;

    public Record(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getScore() { return score; }

    @Override
    public String toString() {
        return id + "," + name + "," + score;
    }
}

