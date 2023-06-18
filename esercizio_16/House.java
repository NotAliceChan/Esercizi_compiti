package esercizio_16;

    public class House {
    String indirizzo;
    int floorNumber;

    public House(String ind, int floorNumber) {
        this.indirizzo = ind;
        this.floorNumber = floorNumber;
        System.out.println("La Casa è stata Costruita.");
    }

    public void printHouse() {
        System.out.println("Casa in indirizzo: " + indirizzo +
                ", Ha " + floorNumber +
                " Piani. ");

    }
}