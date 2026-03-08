package com.example.quizgame.dao;

import com.example.quizgame.model.Question;
import java.util.ArrayList;
import java.util.List;

public class QuestionDao {

    public static List<Question> getQuestions(String category) {

        List<Question> questions = new ArrayList<>();

        if (category.equalsIgnoreCase("Math")) {         

            questions.add(new Question("7^2 + 3 * 5 = ?", new String[]{"58", "56", "49", "66"}, 0));
            questions.add(new Question("Solve for x: 2x + 7 = 19", new String[]{"5", "6", "7", "8"}, 1));
            questions.add(new Question("Sum of first 10 natural numbers?", new String[]{"50", "55", "45", "60"}, 1));
            questions.add(new Question("Factorize x^2 - 9", new String[]{"(x+3)(x-3)", "(x+9)(x-1)", "(x+1)(x-9)", "(x+3)^2"}, 0));
            questions.add(new Question("Triangle angles ratio 2:3:4, largest angle?", new String[]{"80°","90°","100°","120°"}, 2));
            questions.add(new Question("Square root of 256?", new String[]{"12","14","16","18"}, 2));
            questions.add(new Question("Solve 5(x-2)=3x+4", new String[]{"6","7","8","9"}, 0));
            questions.add(new Question("Remainder when 123 divided by 7?", new String[]{"3","4","5","6"}, 2));
            questions.add(new Question("x^2 = 49, x = ?", new String[]{"7","-7","±7","0"}, 2));
            questions.add(new Question("Rectangle 12x5 cm, diagonal?", new String[]{"13","12","10","14"}, 0));
            questions.add(new Question("What is 2 + 2?", new String[]{"3", "4", "5", "6"}, 1));
            questions.add(new Question("What is 5 * 3?", new String[]{"15", "20", "10", "25"}, 0));
            questions.add(new Question("What is 12 / 4?", new String[]{"2", "3", "4", "6"}, 1));

        } else if (category.equalsIgnoreCase("Science")) {

            questions.add(new Question("Water's chemical formula?", new String[]{"H2O", "CO2", "O2", "NaCl"}, 0));
            questions.add(new Question("Sun is a?", new String[]{"Planet", "Star", "Moon", "Comet"}, 1));
            questions.add(new Question("Human body has how many hearts?", new String[]{"1", "2", "3", "4"}, 0));

        } else if (category.equalsIgnoreCase("History")) {

            questions.add(new Question("Who discovered America?", new String[]{"Columbus", "Newton", "Einstein", "Shakespeare"}, 0));
            questions.add(new Question("World War II ended in?", new String[]{"1945", "1939", "1918", "1960"}, 0));
            questions.add(new Question("First president of USA?", new String[]{"Lincoln", "Washington", "Jefferson", "Adams"}, 1));
        }

        return questions;
    }
}
