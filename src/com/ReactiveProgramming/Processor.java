package com.ReactiveProgramming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Processor {
    public static void main(String[] args) {

    }
    private static String[] getStrings() {
      String filePath = "res/numbers.txt";
      try (Stream<String> words =
              Files.lines(Paths.get(filePath))) {

      } catch (IOException e) {
          e.printStackTrace();
      }
    }
}
