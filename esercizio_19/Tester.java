package esercizio_19;

/**
 * The type Tester.
 */
public class Tester {
    /**
     * Run test.
     */
    public void runTest() {
        WordGames wordGames = new WordGames();

    }

    /**
     * Run add hello word test string.
     *
     * @param wordGames the word games
     * @param word      the word
     * @return the string
     */
    public String runAddHelloWordTest(WordGames wordGames, String word) {
        return wordGames.addHelloWord(word);
    }

    /**
     * Run get full name test string.
     *
     * @param wordGames the word games
     * @param name      the name
     * @param surname   the surname
     * @return the string
     */
    public String runGetFullNameTest(WordGames wordGames, String name, String surname) {
        return wordGames.getFullName(name, surname);
    }
}
