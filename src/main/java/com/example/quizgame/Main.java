package com.example.quizgame;

import com.example.quizgame.controller.QuizController;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("           QUIZ GAME           ");
        System.out.println("=====================================");

       

        QuizController controller = new QuizController();
        controller.showMenu();

        input.close();
    }
}
