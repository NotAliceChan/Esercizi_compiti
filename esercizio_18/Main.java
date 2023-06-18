package esercizio_18;

import esercizio_18.Badge;
import esercizio_18.Employee;

public class Main {
    public static void main(String[] args) {
        //creazione 2 oggetti Employee
Employee employee1 = new Employee("Francesco", "Esposito", "Via Giannetti 27");
Employee employee2 = new Employee("Savastano", "Bianchi", "Piazza Magentano 22");

        //qua andiamo a creare i vari badge a disposizione dei employeer
Badge badge1 = new Badge(employee1);
Badge badge2 = new Badge(employee2);

        badge1.showBadgeDetails();
        System.out.println(" ");
        badge2.showBadgeDetails();
    }
}
