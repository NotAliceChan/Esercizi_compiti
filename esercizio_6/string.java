package esercizio_6;

public class string {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "How are you?";

        if (string1.length() > 2 && string2.length() > 2) {
            char ch1 = string1.charAt(0);
            char ch2 = string1.charAt(1);

            char ch3 = string2.charAt(string2.length() - 2);
            char ch4 = string2.charAt(string2.length() - 1);

            System.out.println("La Parola è¨ : " + ch1 + ch2 + ch3 + ch4);
        } else {
            System.out.println("ERRORE: una delle due stringhe ha meno di 2 caratteri");
        }
    }
}

