package appunti;

import java.util.*;

public class Collection {
    public static void main(String[] args) {

        //classe Meal con contenuto che si usa per la map riga 32
        class Meal {
            //si definiscono double , int e stringa che sono per prezzo , calorie e inggredienti
            // se si va ad aggiungere tipo esempio voglio mettere gli allergeni si deve aggiungere qui e anche
            // al map dentro le () in (7.80, 500, Set.of("Bun", "Patty", "Sauce", "Chese single"));
            //7.00 è il przzo, 500 le calorie e poi SetOf gli ingredienti.
            private double price;
            private int calories;
            private Set<String> ingredients;



            // Costruttore della classe "Meal"
            public Meal(double price, int calories, Set<String> ingredients) {
                this.price = price;
                this.calories = calories;
                this.ingredients = ingredients;
            }


            // Metodo per stampare le informazioni del pasto
            public void printMealInfo() {
                System.out.println("Price: €" + price);
                System.out.println("Calories: " + calories);
                System.out.println("Ingredients: " + ingredients);
            }

        }   //qua finisce la classe Meal e continua con la classe Collection

      

        // Creazione di un oggetto "Map" per memorizzare il menu dei pasti
        Map<String, Meal> menu = new HashMap<>();

        // Creazione di oggetti "Meal" per i vari pasti nel menu
        Meal beefBurgher = new Meal(7.60, 500, Set.of("Bun", "Patty", "Sauce"));
        Meal cheeseBurgher = new Meal(7.80, 500, Set.of("Bun", "Patty", "Sauce", "Chese single"));

        // Aggiunta dei pasti al menu utilizzando il metodo "put" della classe "Map"
        menu.put("Burgher", beefBurgher);
        menu.put("Cheese Burgher", cheeseBurgher);
        menu.put("Fries", new Meal(3.50, 250, Set.of("Potato", "Loads of Oil")));
        menu.put("Pizza", new Meal(10.0, 700, Set.of("Dough", "Cheese", "Tomato", "Toppings")));

        // Iterazione sul menu dei pasti utilizzando un "for-each loop"
        for (Map.Entry<String, Meal> entry : menu.entrySet()) {
            String mealName = entry.getKey(); // Ottiene il nome del pasto
            Meal meal = entry.getValue(); // Ottiene l'oggetto "Meal" corrispondente al pasto

            System.out.println("Meal Name: " + mealName); // Stampa il nome del pasto
            meal.printMealInfo(); // Stampa le informazioni del pasto utilizzando il metodo "printMealInfo"
            System.out.println(); // Stampa una riga vuota tra i pasti
        }

        // Creazione di un oggetto "Set" per memorizzare i tipi di hamburger
        Set<Meal> burgherTypes = new HashSet<>();

        // Aggiunta dei tipi di hamburger al "Set"
        burgherTypes.add(beefBurgher);
        burgherTypes.add(cheeseBurgher);
    }
}