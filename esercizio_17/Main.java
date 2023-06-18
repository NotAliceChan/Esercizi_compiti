package esercizio_17;
import esercizio_17.House;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

House house1 = new House();

System.out.println("Inserire indirizzo:");

house1.setIndirizzo (scanner.nextLine());

System.out.println("Inserisci i numeri di piani");

house1.setFloorNumber(scanner.nextInt());
scanner.nextLine();

System.out.println("Inserire i conquilini (massimo 3): ");

System.out.println("Esempio : Giampertondola, Anto, Kurolili");

String stringa = scanner.nextLine();
String[] arrayString = stringa.split(", ");

house1.setResidentsNames(arrayString[0],arrayString[1],arrayString[2]);

System.out.println("indirizzo: " + house1.getIndirizzo());
System.out.println("i Piani del palazzo sono: " + house1.getFloorNumber());
System.out.println("Le persone che abitano sono: " + Arrays.toString(house1.getResidentsNames())
        .replace("[", "")
        .replace("]", "")
);

System.out.println("il capocondominio è " + house1.residentsNames[1]);


// programma migliorabile con cicli while ( finche l'imput non è corretto )


    }

}
