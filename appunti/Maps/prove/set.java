package appunti.Maps.prove;

import java.util.*;

public class set {
    public static void main(String[] args) {
        Set<String> food = new HashSet<>();

        food.add("Hamburgher");

        int size = food.size();
        System.out.println("Il menu contiene : " + size + " Portate");

        food.add("CheeseBurgher");

        int sizeUptade1 = food.size();
        System.out.println("Il menu contiene : " + sizeUptade1 + " Portate");

        Boolean containsHamburgher = food.contains("Hamburgher");
        String containsHamburgherYesOrNot = containsHamburgher ? "Si" : "No";
        System.out.println("Il menu contiene Hamburgher?: " + containsHamburgherYesOrNot);


        boolean cheeseRemoved = food.remove("CheeseBurgher");
        String cheeseRemovedYesOrNot = cheeseRemoved ? "Si" : "No";
        System.out.println("Rimosso CheeseBurgher?: " + cheeseRemovedYesOrNot);

        System.out.println(" ");

        for (
                String piatto : food) {
            System.out.println(piatto);
        }

    }
}
    class



    Info {

        private Double price;
        private Integer calories;
        private String ingredients;

        public Info(Double price, Integer calories, String ingredients) {
            this.price = price;
            this.calories = calories;
            this.ingredients = ingredients;

        }

        public void printMenu() {
            System.out.println("Prezzo: " + price + "\n" + "Calorie: " + calories + "\n" + "Ingredienti: " + ingredients);
        }
    }

 class Main {
    public static void main(String[] args) {
        Map<String, Info> menulist = new HashMap<>();
        menulist.put("Hamburger", new Info(12.0, 500, "Pane, Carne di manzo"));
        menulist.put("Pizza", new Info(10.0, 800, "Pane, Salsa, Formaggio"));

        // Stampa l'intero contenuto della lista utilizzando System.out.println(menulist)
        System.out.println(menulist);
    }
}
