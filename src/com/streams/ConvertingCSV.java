package com.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertingCSV {
    public static void main(String[] args) {

    }
    private static class ShoppingArticle {
        final String name;
        final String Category;
        final double price;
        final String unit;

        private ShoppingArticle(String name, String Category, double price, String unit) {
            this.name = name;
            this.Category = Category;
            this.price = price;
            this.unit = unit;
        }
        @Override
        public  String toString() {
            return name + "( " + Category + ")";

        }
    }
    private static List<ShoppingArticle> loadDatabaseFile() throws IOException {
        try (Stream<String> stream = Files.lines(Path.of("res/database.csv"))) {
            return stream.peek((line) -> {
                System.out.println(line);
            }).skip(1).map((line) -> {
                return line.split(",");
            }).peek((arr) -> {
                System.out.println(Arrays.toString(arr));
            }).map((arr) -> {
                return new ShoppingArticle(arr[0], arr[1], Double.valueOf(arr[2]), arr[3]);
            }).peek((art) -> {
                System.out.println(art);
            }).collect(Collectors.toUnmodifiableList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
