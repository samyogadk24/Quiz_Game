package com.example.quizgame.controller;

import com.example.quizgame.model.Result;
import com.example.quizgame.service.QuizService;
import com.example.quizgame.utils.FileUtils;

import java.util.Scanner;

public class QuizController {

    private Scanner scanner = new Scanner(System.in);
    private QuizService quizService = new QuizService();

    public void showMenu() {
        System.out.println("=== Welcome to Quiz Game ===");
        System.out.println("1. Start Quiz");
        System.out.println("2. Exit");

        System.out.print("Choose an option: ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                startQuiz();
                break;
            case "2":
                showCredits();
                System.out.println("Thank you for playing!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice! Try again.\n");
                showMenu();
        }
    }

    private void startQuiz() {
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
    
        
        showInstructions();

        System.out.println("\nSelect a category: Math, Science, History");
        String category = scanner.nextLine();

        
        
      int score = quizService.startQuiz(category);

     System.out.println("\nYour total score: " + score);

 
      Result result = new Result(name, category, score);


     FileUtils.saveResult(result);

     showCredits() ;
     showMenu();

    }

    private void showInstructions() {
        System.out.println("\n=== Instructions ===");
        System.out.println("- Choose a category before starting.");
        System.out.println("- Answer MCQ questions by typing numbers 1 to 4.");
        System.out.println("- Each correct answer gives 1 point.");
        System.out.println("- Wrong answers give 0 points.");
        System.out.println("- Your total score will be displayed at the end.\n");
        System.out.println("Good luck!\n");
    }


    private void showCredits() {
        System.out.println("\n=== Credits ===");
        System.out.println(" Quiz Game developed by: [Dev's & Smriti]");
        System.out.println("");
      
    }
}
