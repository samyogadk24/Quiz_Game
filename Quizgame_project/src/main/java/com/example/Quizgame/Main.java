package com.example.quizgame;

import java.util.Scanner;
import com.example.quizgame.controller.QuizController;

public class Main {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Hello gamers! Welcome to my Quiz game ");
System.out.println("---------------------------------------");

System.out.print("What's your name? ");
String name = input.nextLine();

System.out.println("Welcome, " + name + "! ");

QuizController quizController = new QuizController(input);
quizController.showMenu();
}
}
 