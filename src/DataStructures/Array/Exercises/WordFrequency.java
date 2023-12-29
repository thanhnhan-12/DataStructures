package DataStructures.Array.Exercises;

public class WordFrequency {
    public static int countWordOccurrences(String text, String word) {
        int count = 0;
        int index = text.indexOf(word);

        while (index != -1) {
            count++;
            index = text.indexOf(word, index + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        String mainText = "This is an example text. This text contains an example word.";

        String wordToFind = "example";
        int frequency = countWordOccurrences(mainText, wordToFind);

        System.out.println("Number of occurrences of: " + wordToFind + " is " + frequency);
    }
}
