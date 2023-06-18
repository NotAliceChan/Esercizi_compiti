package esercizio_15;

import esercizio_15.Programmer;

public class TestProgrammer {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer();
        Programmer programmer2 = new Programmer();
        Programmer programmer3 = new Programmer();

        programmer1.nome = "Alice";
        programmer1.età = 24;
        programmer1.wearsGlasses = true;
        programmer1.genere = "ragazza";

        programmer2.nome = "Francesco";
        programmer2.età = 27;
        programmer2.wearsGlasses = false;
        programmer2.genere = "ragazzo";

        programmer3.nome = "Arono";
        programmer3.età = 22;
        programmer3.wearsGlasses = false;
        programmer3.genere = "Non Binario";



        programmer1.drinkCoffee();
        programmer1.printDetails();
        programmer1.hasGlasses();

        System.out.println(" ");

        programmer2.drinkCoffee();
        programmer2.printDetails();
        programmer2.hasGlasses();

        System.out.println(" ");

        programmer3.drinkCoffee();
        programmer3.printDetails();
        programmer3.hasGlasses();
    }
}