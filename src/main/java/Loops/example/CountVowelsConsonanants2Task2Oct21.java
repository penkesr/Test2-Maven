package Loops.example;

public class CountVowelsConsonanants2Task2Oct21 {
    public static void main(String[] args) {
        String input = "Hello, World!";
        int syllables = countSyllables(input);
        System.out.println("Approximate number of syllables: " + syllables);
    }

    public static int countSyllables(String word) {
        word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
        if (word.length() <= 3) return 1;

        String[] tokens = word.split("[aeiouy]+");
        int syllableCount = 0;

        for (String token : tokens) {
            if (!token.isEmpty()) {
                syllableCount++;
            }
        }

        if (word.endsWith("e")) {
            syllableCount--;
        }
        if (word.endsWith("le")) {
            syllableCount++;
        }
        if (syllableCount == 0) {
            syllableCount = 1;
        }

        return syllableCount;
    }
}
