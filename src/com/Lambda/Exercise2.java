package com.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args ) {
        ShoppingCart myFirstCart = new ShoppingCart(new ArrayList<>());
        ShoppingCart mySecondCart = myFirstCart.addItem(new ShoppingItem("laptop", 234));
        ShoppingCart myThirdCart = mySecondCart.addItem(new ShoppingItem( "break", 600));

        System.out.println("First" + myFirstCart);
        System.out.println("Second" + mySecondCart);
        System.out.println("Third" + mySecondCart);


    }

    public static final class ShoppingCart {

            public final List<ShoppingItem> myShoppingList;

            public ShoppingCart(List<ShoppingItem> list) {
                myShoppingList = Collections.unmodifiableList(list);
            }

            public ShoppingCart addItem(ShoppingItem item) {
                List<ShoppingItem> newList = new ArrayList<>(myShoppingList);
                newList.add(item);
                return new ShoppingCart(newList);
            }

        @Override
        public String toString() {
            return "ShoppingCart" +
                    "myShoppingList=" + myShoppingList +
                    '}';
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

