package appunti.Maps;

import java.util.HashMap;

 class Maps {
    public static void main(String[] args) {
        // Creazione di un oggetto HashMap
        HashMap<String, Integer> studentScores = new HashMap<>();

        // Aggiunta di elementi all'HashMap
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 80);
        studentScores.put("Charlie", 95);
        studentScores.put("David", 88);

        // Accesso ai valori tramite le chiavi
        int aliceScore = studentScores.get("Alice");
        System.out.println("Punteggio di Alice: " + aliceScore);

        // Iterazione sull'HashMap
        for (String studentName : studentScores.keySet()) {
            int score = studentScores.get(studentName);
            System.out.println(studentName + ": " + score);
        }

        // Verifica dell'esistenza di una chiave
        boolean isBobPresent = studentScores.containsKey("Bob");
        System.out.println("Bob presente? " + isBobPresent);

        // Dimensione dell'HashMap
        int size = studentScores.size();
        System.out.println("Dimensione dell'HashMap: " + size);

        // Rimozione di un elemento dall'HashMap
        studentScores.remove("Charlie");

        // Verifica se l'HashMap è vuoto
        boolean isEmpty = studentScores.isEmpty();
        System.out.println("L'HashMap è vuoto? " + isEmpty);
    }
}