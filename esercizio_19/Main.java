package esercizio_19;

public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        WordGames wordGames = new WordGames();
        Tester tester = new Tester();

        String helloWord = tester.runAddHelloWordTest(wordGames, "World");
        System.out.println(helloWord);

        String fullName = tester.runGetFullNameTest(wordGames, "Gionni", "Bravo" );
        System.out.println(fullName);


    }

}
