package DataStructures.Array.Exercises;

public class CharacterFrequency {
    public static int countCharOccurrences(String str, char ch) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String text = "Hello, how are you?";
        char characterToFind = 'o';

        int frequency = countCharOccurrences(text, characterToFind);

        System.out.println("Số lần ký tự '" + characterToFind + "' xuất hiện trong chuỗi: " + frequency);
    }
}
