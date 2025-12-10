package com.example.quizgame.service;

import java.util.Scanner;
import com.example.quizgame.model.Question;
import com.example.quizgame.questions.GKQuestions;
import com.example.quizgame.questions.MathQuestions;
import com.example.quizgame.questions.ScienceQuestions;


public class QuizService {

    private Scanner input;

    public QuizService(Scanner scanner) {
        this.input = scanner;
    }

    public void startQuiz() {

        System.out.println("Choose Subject:");
        System.out.println("1. General Knowledge");
        System.out.println("2. Science");
        System.out.println("3. Maths");
        System.out.print("Enter option: ");
        int choice = input.nextInt();

        Question[] questions;

        if (choice == 1) {
            questions = GKQuestions.get();   
        } else if (choice == 2) {
            questions = ScienceQuestions.get(); 
        } else if (choice == 3) {
            questions = MathQuestions.get();     
        } else {
            System.out.println("Invalid Choice!");
            return;
        }

        int score = 0;

        for (Question q : questions) {
            System.out.println("\n" + q.question);

            for (String option : q.options) {
                System.out.println(option);
            }

            System.out.print("Answer (1-4): ");
            int ans = input.nextInt();

            if (ans == q.correctAnswer) {
                System.out.println("Correct ✔");
                score++;
            } else {
                System.out.println("Wrong ✘");
            }
        }

        System.out.println("\nQuiz Over! Your Score: " + score + "/" + questions.length);
    }
}
