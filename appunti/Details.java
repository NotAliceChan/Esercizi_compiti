package appunti;
import java.util.*;
public class Details {

        private double price;

        private int calories;

        private Set<String> ing;


        public Details(double prezzo, int calorie, Set<String> ingredienti) {
            this.price = prezzo;
            this.calories = calorie;
            this.ing = ingredienti;
        }

public void printDetailsInfo(){
            System.out.println("Prezzo :" + price + "\n" + "Calorie: " + calories + "\n" + "Ingredienti: " + ing);
}

    }


    class Main{



    }