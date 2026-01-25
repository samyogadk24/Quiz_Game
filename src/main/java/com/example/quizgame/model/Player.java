package com.example.quizgame.model;

public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() { return name; }
    public int getScore() { return score; }
    public void addScore(int delta) { this.score += delta; }
    public void setScore(int s) { this.score = s; }
}
