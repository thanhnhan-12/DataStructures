package DataStructures.Array.Exercises;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word1 = "racecar";
        String word2 = "hello";

        System.out.println(word1 + " is palindrome? " + isPalindrome(word1));
        System.out.println(word2 + " is palindrome? " + isPalindrome(word2));
    }
}
