package esercizio_15;

public class Programmer {
    String nome;
    int età;
    boolean wearsGlasses;
    String genere;

    public void drinkCoffee() {
        System.out.println("Espresso è il segreto!");
    }

    public void printDetails() {
        System.out.println(nome + getGenereSalutation() + età + "-yo.");
    }

    public void hasGlasses() {
        String wearsGlassesString = wearsGlasses ? "si" : "no";
        System.out.println("Indossa " + nome + " gli occhiali? " + wearsGlassesString);
    }


    private String getGenereSalutation() {
        if (genere.equalsIgnoreCase("ragazzo")) {
            return " è un programmatore ";
        } else if (genere.equalsIgnoreCase("ragazza")) {
            return " è una programmatrice ";
        } else if (genere.equalsIgnoreCase("Non Binario")) {
            return " una Persona programmante ";
        } else {
            return "Il Genere non è definito";
        }

    }
}