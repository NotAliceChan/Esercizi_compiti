package esercizio_4;

public class number {

    public static void main(String[] args) {
        int a = 15;
        System.out.println("il numero base Ã¨ : " + a);
        int b = a + 5;
        System.out.println("il numero Ã¨ : " + b);
        a -= 4;
        System.out.println("il numero Ã¨ : " + a );
        int c = b + 1;
        System.out.println("il numero Ã¨ : " + c );
        boolean dichiariazione1 = b % 2 != 0;
        boolean dichiariazione2 = (c * (c + 1)) % 3 == 0;

        System.out.println("La dichiarazione 1 : " + dichiariazione1);
        System.out.println("La dichiarazione 2 : " + dichiariazione2);
    }
}
