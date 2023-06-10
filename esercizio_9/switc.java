package esercizio_9;

import java.util.Scanner;

public class switc {
    public static void main(String[] args) {

        int number;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please Enter the Number");
            number = scanner.nextInt();
            scanner.nextLine();

            switch (number) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Tem");
                    break;
                default:
                    System.out.println("Error Cannot give you the name");
                    break;


            }
        }
    }
}
