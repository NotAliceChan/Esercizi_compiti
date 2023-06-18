package esercizio_13;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double soldiRegno = 10_000;
        String valuta = "Sterline Britaniche";

        System.out.println("I soldi del Regno Unito sono: " + soldiRegno + " " + valuta);

        Random random = new Random();
        boolean venduto = false;
        int giorniNecessari = 0;

        while (!venduto) {
            double tasso_di_cambio = 1 + (Math.random() * 0.2);

            if (tasso_di_cambio > 1.15) {
                double euro = 1000 * tasso_di_cambio;
                System.out.println("N. Giorno " + giorniNecessari + " Vendo 1000 sterline a un tasso di cambio di " + tasso_di_cambio + " per un totale di " + euro + " euro.\n");

                soldiRegno -= 1000;

            } else {
                System.out.println("N. Giorno " + giorniNecessari + " il tasso di vendita non soddisfa i requisiti");
            }

            giorniNecessari++;

            if (soldiRegno < 1000) {
                venduto = true;
            }
        }


        System.out.println("Vendita completata in " + giorniNecessari + " giorni!");
    }
}