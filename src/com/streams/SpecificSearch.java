package com.streams;
//Build a function that will find the cheapest fruit from a list of ShoppingArticles.
//        Build a function that will find the most expensive vegetable from a list of ShoppingArticles.
//        Build a function that will gather all fruits in a separate list.
//        Build a function that will find the five least expensive articles in the database.
//        Build a function that will find the five most expensive articles in the database.


import java.util.Comparator;
import java.util.List;

public class SpecificSearch {
    final String name;
    final String Category;
    final double price;
    final String unit;

    public static void main(String[] args) {

    }

    private SpecificSearch(String name, String Category, double price, String unit) {
        this.name = name;
        this.Category = Category;
        this.price = price;
        this.unit = unit;

    }

    @Override
    public String toString() {
        return name + "(" + Category + ")";
    }


    private static SpecificSearch findCheapestFruit(List<SpecificSearch> articles) {
        return articles.stream()
                .filter((article) -> article.Category.equals("Fruits"))
                .min(Comparator.comparingDouble(article -> article.price))
                .orElse(null);
    }
    private static SpecificSearch findMostExpensive(List<SpecificSearch> articles) {
        return articles.stream()
                .filter((article) ->article.Category.equals("Vegetables"))
                .max(Comparator.comparingDouble(article -> article.price))
                .orElse(null);
    }
}