package com.example.quizgame.model;

public class Result {
    private String name;
    private String category;
    private int score;

    public Result(String name, String category, int score) {
        this.name = name;
        this.category = category;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + " | " + category + " | " + score;
    }
}
