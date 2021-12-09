package com.pluralsight.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TheArrayProblem {
    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        for(Product p : products) {
            if (p.getWeight() > 20) System.out.println(p.getName());
        }
    }

    private static Product[] add(Product product, Product[] array){
        int length = array.length;
        Product[] newArray = Arrays.copyOf(array, length + 1);
        newArray[length] = product;
        return newArray;
    }
}
