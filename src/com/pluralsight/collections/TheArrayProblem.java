package com.pluralsight.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class TheArrayProblem {
    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

//        System.out.println(products.size());
//        System.out.println(products.isEmpty());
//        System.out.println(products.contains(window));
//        System.out.println(products.remove(window));
//        System.out.println(products.contains(window));

        Collection<Product> toRemove = new ArrayList<>();
        toRemove.add(door);
        toRemove.add(window);
        products.removeAll(toRemove);
        System.out.println(products);

    }

    private static Product[] add(Product product, Product[] array){
        int length = array.length;
        Product[] newArray = Arrays.copyOf(array, length + 1);
        newArray[length] = product;
        return newArray;
    }
}
