package esercizio_5;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Create a String to hold some text, decide on the text you want it to hold and then name it appropriately
     *
     *    print out your string in upper case, and in lower case
     */


    private static void exercise1() {
        System.out.println("\nesercizio 1:");
        //Write your code here
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String frutta = "mela";


        System.out.println(frutta.toLowerCase());
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(frutta.toUpperCase());

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }



    /**
     * 2: Edit the code below so it prints out the first name and last name in uppercase, and the middle name in lower case
     */
    private static void exercise2() {

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\nEsercizio 2:");
        // Change these

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String firstName = "Alice";
        String middleName = "NotFen";
        String lastName = "Barretta";

        System.out.println(firstName.toUpperCase() + " " + middleName + " " + lastName.toUpperCase()); // <--- Edit this line

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


     /**
     * 3: Assign the value of 2 or more primitive types to our variable textFrom2Primitives
     *
     * Use the '+' operator
     *
     * choose from these primitives: double, int, char, boolean
     * use primitive literals like: 1.5, 67, 'b', true
     *
     * +
     *
     * Experiment with these different types, how do an int and a double behave when added?
     *
     * What about a boolean and an int?
      *
      * "" + 1.5
     *
     */
    private static void exercise3() {
        System.out.println("\nEsercizio 3:");

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String textFrom2Primitives = String.valueOf(2); // <--- Edit this line
        int textFrom3Primitives = 3;
        double textFrom1_5Primitives = 1.5;
        char textFrom5Primitives = 5;
        boolean boolValue = true;

        textFrom2Primitives = " " + textFrom3Primitives + textFrom1_5Primitives + textFrom5Primitives + boolValue;

        System.out.println(textFrom2Primitives);


        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



     /**
     * 4: Without editing the Strings below make the print statement print
     *
     *    1 2 3 4 5 6 7 8 9 with the correct spacing in between all the numbers
     *
     *    You will need to use .trim()
     */
    private static void exercise4() {
        System.out.println("\nEsercizio 4:");

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String endNumbers = "7 8 9";
        String middleNumbers = "       4 5 6";
        String earlyNumbers = "1 2 3";

        System.out.println(earlyNumbers.trim() + " " + middleNumbers.trim() + " " + endNumbers.trim()); // <--- Write your code here

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}