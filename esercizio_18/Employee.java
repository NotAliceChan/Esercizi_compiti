package esercizio_18;

public class Employee {
    private String nome;
    private String cognome;
    private String indirizzo;

    // Costrutto Employee contenenente nome, cognome e indirizzo
    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress) {
        this.nome = newEmployeeName;
        this.cognome = newEmployeeSurname;
        this.indirizzo = newEmployeeAddress;
    }

    // getting di name
    public String getName() {
        return nome;
    }

    //getting di surname
    public String getSurname() {
        return cognome;
    }

    //getting di indirizzo
    public String getAdress() {
        return indirizzo;
    }

    public String getEmployeeDetails() { //con \n andiamo a mandare a capo ogni sezione
        return "Nome: " + nome + "\nCognome: " + cognome + "\nIndirizzo: " + indirizzo;
    }
}