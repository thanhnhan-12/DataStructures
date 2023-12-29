package DataStructures.Array.Exercises;

public class ReverseString {
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String s1 = "world";
        System.out.println(reverseString(s1));
    }
}
