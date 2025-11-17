package main.java.com.example.Quizgame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello gamers! Welcome to my Quiz game ");
        System.out.println("---------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("What's your name? ");
        String name = input.nextLine();

        System.out.println("Welcome, " + name + "! ");

        while (true) {
            System.out.println("\n=== QUIZ GAME MENU ===");
            System.out.println("1. Start Quiz");
            System.out.println("2. Instructions");
            System.out.println("3. Credits");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

    
            int choice = input.nextInt();

            
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Starting quiz soon...");
                    break;

                case 2:
                    showInstructions();
                    break;

                case 3:
                    showCredits();
                    break;

                case 4:
                    System.out.println("Exiting the game... Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    public static void showInstructions() {
        System.out.println("\n=== INSTRUCTIONS ===");
        System.out.println("- Choose the correct answer (1 - 4).");
        System.out.println("- Each correct answer gives +1 point.");
        System.out.println("- At the end, you will see your score.");
        System.out.println("======================");
    }

    public static void showCredits() {
        System.out.println("\n=== CREDITS ===");
        System.out.println("Quiz Game created by: Sneakyy (dev's) :)");
        System.out.println("==============================");
    }

}
