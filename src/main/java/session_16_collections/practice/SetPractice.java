package session_16_collections.practice;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<String> products = initializeSet();

        displayProducts(products);
        Set<String> products2 = new HashSet<>();
        products2.add("P500");
        products2.add("P600");
    }

    public static Set<String> mergeProducts(Set<String> firstSet, Set<String> secondSet) {
        Set<String> result = new HashSet<>(firstSet);
        result.addAll(secondSet);
        return result;
    }

    public static Set<String> initializeSet() {
        Set<String> products = new HashSet<>();
        products.add("P100");
        products.add("P101");
        products.add("P102");

        return products;
    }

    public static void displayProducts(Set<String> products) {
        for (String product : products) {
            System.out.println(product);
        }
    }
}


