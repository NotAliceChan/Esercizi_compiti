package esercizio_14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class date {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();


        String formattedDate = localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        String formattedDate2 = localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String formattedDate3 = localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        String formattedDate4 = localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

        System.out.println("La data di sistema è: " + localDate+ "\n");

        System.out.println("La data di oggi di taglia Corta è: " + formattedDate + "\n");

        System.out.println("La data di oggi di taglia Media è: " + formattedDate2+ "\n");

        System.out.println("La data di oggi di taglia Lunga è: " + formattedDate3+ "\n");

        System.out.println("La data di oggi di taglia Completa è: " + formattedDate4+ "\n");



        System.out.println("Il Mese finisce in: " + (localDate.lengthOfMonth() - localDate.getDayOfMonth()) + " Giorni!");

        System.out.println("L'anno finisce in: " + (localDate.lengthOfYear() - localDate.getDayOfYear()) + " Giorni!");
    }
}