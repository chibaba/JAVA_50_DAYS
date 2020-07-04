package com.streams;

import com.streams.ShoppingCart.ShoppingArticle;

import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        ShoppingCart fruitCart = new ShoppingCart(List.of(
                new ShoppingArticle("Orange", 1.5),
                new ShoppingArticle("Apple", 1.7),
                new ShoppingArticle("Banana", 2.2)
        ));
        ShoppingCart vegetableCart = new ShoppingCart(List.of(
                new ShoppingArticle("cucumber", 0.8),
                new ShoppingArticle()
        ))

    }

    private static final class ShoppingArticle {
        final String name;
        final double price;

        public ShoppingArticle(String name, double price) {
            this.name = name;
            this.price = price;
        }


    }

    private static  final class ShoppingCart {
        final List<ShoppingArticle> mArticles;
        public com.streams.ShoppingCart(List<ShoppingArticle> list) {
            mArticles = List.copyOf(list);
        }
    }
}
