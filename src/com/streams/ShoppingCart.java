package com.streams;

import com.streams.ShoppingCart.ShoppingArticle;

import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {

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
