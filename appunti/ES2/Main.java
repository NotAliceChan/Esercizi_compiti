package appunti.ES2;

public class Main {
    public static void main(String[] args) {



    Prestazioni car1 = new Prestazioni(1000, 600,"Ferrari", "La Ferrari", 120000.0);
    Prestazioni car2 = new Prestazioni(1400, 800, "Bugatti", "Chiron", 4000000.0);

    car1.printMacchina();

    System.out.println();

    car2.printMacchina();

    }
}