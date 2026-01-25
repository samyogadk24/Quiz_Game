package com.example.quizgame.service;

import com.example.quizgame.dao.QuestionDao;
import com.example.quizgame.model.Question;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuizService {

    private Scanner scanner = new Scanner(System.in);

    public int startQuiz(String category) {
        List<Question> questions = QuestionDao.getQuestions(category);
        Collections.shuffle(questions); 

        int score = 0;

            for (Question q : questions) {
                System.out.println("\n" + q.getQuestion());
                String[] options = q.getOptions();
                for (int i = 0; i < options.length; i++) {
                    System.out.println((i + 1) + ". " + options[i]);
                }

            int answer = 0;
            while (true) {
                System.out.print("Your answer (1-4): ");
                try {
                    answer = Integer.parseInt(scanner.nextLine());
                    if (answer >= 1 && answer <= 4) break;
                    else System.out.println("Enter a number between 1 and 4.");
                } catch (Exception e) {
                    System.out.println("Enter a valid number.");
                }
            }

            if (answer - 1 == q.getCorrectOption()) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + options[q.getCorrectOption()]);
            }
        }

        return score;
    }
}
