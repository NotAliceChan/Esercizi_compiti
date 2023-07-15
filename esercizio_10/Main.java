package esercizio_10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] carBrand = new String[]{
                "Ferrari", "Porshe", "Toyota", "McLaren", "Bugatti"
        };

        System.out.println("i Brand Sono in totale : " + carBrand.length);

        System.out.println(carBrand[2]);

        int[] primalNumbers = new int[6];
        primalNumbers[0]= 2;
        primalNumbers[1]= 3;
        primalNumbers[2]= 5;
        primalNumbers[3]= 7;
        primalNumbers[4]= 11;
        primalNumbers[5]= 13;
        System.out.println("array numeri primari");
        System.out.println(Arrays.toString(primalNumbers)
                .replace("[","")
                .replace("]", "")
                .replace(",", " > ")
        );


    }
}




