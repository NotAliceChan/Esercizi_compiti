package esercizio_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        cityNames();
        Rome();
    }

    private static void cityNames() {
       // <String> cityNames = new ArrayList<>(Arrays.asList("Firenze", "Rimini", "Venezia"));

        String[] cityArray = new String[3];
        cityArray[0]= "Firenze";
        cityArray[1]= "Rimini";
        cityArray[2]= "Venezia";

        final List<String> cittaNomi = Arrays.asList(cityArray);


        System.out.println("Le città sono: ");
        System.out.println(cittaNomi);

        /*
         // non si può aggiungere o rimuovere nulla in una lista non mutabile

        System.out.println("Aggiornamento delle città: ");
        cittaNomi.add("San Gimignano");
        System.out.println(cityNames);
         */

        System.out.println("Rimini ora ha cambiato nome: ");
        cittaNomi.set(1, "Tegucigalpa");
        System.out.println(cittaNomi);
    }

    private static void Rome() {
        System.out.println("-----------------------------------------------");
        System.out.println("I Rè di Roma :");

        List<String> kingsOfRome = new ArrayList<>();
        kingsOfRome.add("Romulus");
        kingsOfRome.add("Numa");
        kingsOfRome.add("Pompilius");
        kingsOfRome.add("Tullus Hostilius");
        kingsOfRome.add("Ancus Marcius");
        kingsOfRome.add("Tarquinius Priscus");
        kingsOfRome.add("Servius Tullius");
        kingsOfRome.add("Tarquinius Superbus");

        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[kingsOfRome.size()]);

        System.out.println(Arrays.toString(kingsOfRomeArray));

        kingsOfRomeArray[7] = "Lucius Tarquinius Supercar";

        System.out.println("I Rè di Roma :");
        System.out.println(Arrays.toString(kingsOfRomeArray));
    }
}