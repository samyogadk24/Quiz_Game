package main.java.com.example.Quizgame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello gamers! Welcome to my Quiz game ");
        System.out.println("---------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("What's your name? ");
        String name = input.nextLine();

        System.out.println("Welcome, " + name + "! Let's start the quiz.");

        input.close();
    }
}
