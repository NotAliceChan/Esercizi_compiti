package esercizio_17;

public class House {

    String indirizzo;
    int floorNumber;

String[] residentsNames = new String[3];

public String getIndirizzo() {
        return indirizzo;
}

public int getFloorNumber() {
    return floorNumber;
}

public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
}

public void setFloorNumber(int floorNumber) {
    this.floorNumber = floorNumber;
}

public String[] getResidentsNames() {
    return residentsNames;
}

public void setResidentsNames(String s1, String s2, String s3) {
    this.residentsNames[0]= s1;
    this.residentsNames[1]= s2;
    this.residentsNames[2]= s3;
}

}
