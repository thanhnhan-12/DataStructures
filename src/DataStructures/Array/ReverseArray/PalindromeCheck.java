package DataStructures.Array.ReverseArray;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "aba";
        System.out.println("Is Palindrome: " + isPalindrome(str)); // Output: true
    }
}
