package com.Lambda;

//Add a new behavior to your ShoppingCart:
//
//        Create a removeItem(ShoppingItem) function.
//        Create a function that takes multiple ShoppingItem as arguments, either as a list or as variable arguments.
//        Modify your ShoppingCart to take multiple items of each ShoppingItem, for example, four chairs and one table. Additionally, modify the addItem(ShoppingItem) and removeItem(ShoppingItem) functions.
//        Note: If you get stuck, remember that you can find full solution files at the end of the course.

import com.Lambda.Exercise2.ShoppingCart.ShoppingItem;

import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        ShoppingCart myFirstCart = new ShoppingCart(new ArrayList<>());
        ShoppingCart mySecondCart = myFirstCart.addItem(new ShoppingItem("laptop", 234));
        ShoppingCart myThirdCart = mySecondCart.addItem(new ShoppingItem("break", 600));

        System.out.println("First" + myFirstCart);
        System.out.println("Second" + mySecondCart);
        System.out.println("Third" + mySecondCart);


    }

    public static final class ShoppingCart {

        public final List<ShoppingItem> myShoppingList;

        public ShoppingCart(List<ShoppingItem> list) {
            myShoppingList = Collections.unmodifiableList(list);
        }

        public ShoppingCart removeItem(ShoppingItem item) {
            Map<String, Integer> newList = new HashMap<>(myShoppingList);

            int value = 0;
            if (newList.containsKey(item.name)) {
                value = newList.get(item.name);
            }
            if (value > 0) {
                newList.put(item.name, --value);
            }
            return new ShoppingCart(newList);
        }

        public ShoppingCart addItem(ShoppingItem item) {
            Map<String, Integer> newList = new HashMap<>(myShoppingList);
            ShoppingCart newCart = null;
            for (ShoppingItem item : items) {
                newCart = addItem(item);
            }
            return newCart;


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

