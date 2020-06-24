package com.Lambda;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args ) {

    }

    public static final class ShoppingCart {


        private static final class ShoppingCart {
            public final List<ShoppingItem> myShoppingList;

            public ShoppingCart(List<ShoppingItem> list) {
                myShoppingList = collections.unmodifiableList(list)
            }

            public ShoppingCart addItem(ShoppingItem item) {
                List<ShoppingItem> newList = new ArrayList<>(myShoppingList);
                newList.add(item);
                return new ShoppingCart(newList)
            }
        }

        private static final class ShoppingItem {
            private final String name;
            private final int price;

            public ShoppingItem(String name, int price) {
                this.name = name;
                this.price = price;
            }
        }
    }
}
