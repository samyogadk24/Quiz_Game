package com.example.quizgame.utils;

import com.example.quizgame.model.Result;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {

public static void saveResult(Result result) {
try (FileWriter fw = new FileWriter("results.txt", true)) {
fw.write(result.toString() + "\n");
} catch (IOException e) {
System.out.println("Error saving result: " + e.getMessage());
}
}
}
