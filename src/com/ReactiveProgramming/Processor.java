package com.ReactiveProgramming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Processor {
    public static void main(String[] args) {
        Supplier<String> supplier = new Supplier <String>() {
            @Override
            public String get() {
                String[] data = getStrings();
                return null;
            }
        };

    }
    private static String[] getStrings() {
      String filePath = "res/numbers.txt";
      try (Stream<String> words =
              Files.lines(Paths.get(filePath))) {
          return words.flatMap((line) -> Arrays.stream(line.split("[\\s\\n]+")))
                        .filter((word) -> word.length() > 0)
                         .toArray(String[]::new);
      } catch (IOException e) {
          e.printStackTrace();
      }

      return null;
    }
}
