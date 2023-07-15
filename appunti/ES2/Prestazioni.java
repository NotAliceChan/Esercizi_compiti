package appunti.ES2;

public class Prestazioni {

    private int kw;
    private int cavalli;
    private String marca;
    private String modello;
    private Double prezzo;


    public Prestazioni(int kw, int cavalli, String marca, String modello, Double prezzo) {
        this.kw = kw;
        this.cavalli = cavalli;
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
    }

    public int getKw() {
        return kw;
    }

    public void setKw(int kw) {
        this.kw = kw;
    }

    public int getCavalli() {
        return cavalli;
    }

    public void setCavalli(int cavalli) {
        this.cavalli = cavalli;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public void printMacchina(){
        System.out.println("kw motore: " + kw +
                "\nCavalli: " + cavalli +
                "\nMarca: " + marca +
                "\nModello: " + modello +
                "\nPrezzo: " + prezzo);
    }

}
