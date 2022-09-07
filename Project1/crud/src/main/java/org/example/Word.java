package org.example;

public class Word {
    private int id;
    int level;
    String word;

    public Word(int id, int level, String word, String mean) {
        this.id = id;
        this.level = level;
        this.word = word;
        this.mean = mean;
    }

    public Word() {
    }

    String mean;

    public void setId(int id) {
        this.id = id;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public int getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public String getWord() {
        return word;
    }

    public String getMean() {
        return mean;
    }
}
