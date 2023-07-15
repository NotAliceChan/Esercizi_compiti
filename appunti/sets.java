package appunti;

import java.util.*;

public class sets {
    public static void main(String[] args) {
        Set<String> ingredientsList = new TreeSet<>();
        ingredientsList.add("A - Tomato");
        ingredientsList.add("B - Lettuce");
        ingredientsList.add("C - Salad Dressing");
        ingredientsList.add("D - Ketchup");
        for (String ingredient : ingredientsList) {
            System.out.println(ingredient);
        }
    }
}
