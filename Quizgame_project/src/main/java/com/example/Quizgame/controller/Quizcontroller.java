package com.example.quizgame.controller;

import java.util.Scanner;

public class QuizController {

    private final Scanner input;

    public QuizController(Scanner scanner) {
        this.input = scanner;
    }

    public void showMenu() {
      
        int choice = 0;

        while (choice != 3) {
            System.out.println("\n=== QUIZ GAME MENU ===");
            System.out.println("1. Start Quiz");
            System.out.println("2. Credits");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

           
            if (input.hasNextInt()) {
                choice = input.nextInt();
               
                input.nextLine(); 
            } else {
                System.out.println("Invalid input. Please enter a number.");
              
                input.nextLine(); 
                continue; 
            }


            switch (choice) {
                case 1:
                    startQuiz();
                    break;
                case 2:
                    showCredits();
                    break;
                case 3:
                    System.out.println("Exiting.........Goodbye!");
                  
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }

    private void startQuiz() {
        System.out.println("\n=== STARTING QUIZ ===");
        System.out.println("=== HOW TO PLAY ===");
        System.out.println("• Select answers using 1 - 4");
        System.out.println("• Correct answers = 1 point");
        System.out.println("• Score will be displayed at the end\n");

        System.out.println("Quiz begins now...\n");

        QuizService quizService = new QuizService(input);
        quizService.startQuiz();

        



    
    }

    private void showCredits() {
        System.out.println("\n=== CREDITS ===");
        System.out.println("Created by: dev's and smriti");
    }
        
       

   

}