package com.example.quizgame.utils;

import com.example.quizgame.model.Result;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {

    public static void saveResult(Result result) {

        File file = new File("results.txt");

        try (FileWriter fw = new FileWriter(file, true)) {


            if (file.length() == 0) {
                fw.write("Name | Category | Score\n");
            
            }

            fw.write(result.toString() + "\n");

        } catch (IOException e) {
            System.out.println("Error saving result: " + e.getMessage());
        }
    }
}