package appunti.Maps;

public class info {

    double price;

    int qt;

    String name;


    public info(double price, int qt, String name) {
        this.price = price;
        this.qt = qt;
        this.name = name;
    }


    public void printMenu(){
        System.out.println("Prezzo; " + price + "\n" + "Quantità: " + qt + "\n" + "Prodotto: " + name);
    }


}
