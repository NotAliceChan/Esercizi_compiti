package esercizio_19;

public class Tester {
    public void runTest() {
        WordGames wordGames = new WordGames();

    }

    public String runAddHelloWordTest(WordGames wordGames, String word) {
        return wordGames.addHelloWord(word);
    }

    public String runGetFullNameTest(WordGames wordGames, String name, String surname) {
        return wordGames.getFullName(name, surname);
    }
}
