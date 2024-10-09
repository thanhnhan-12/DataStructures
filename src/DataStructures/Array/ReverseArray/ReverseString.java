package DataStructures.Array.ReverseArray;

public class ReverseString {
    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Reversed: " + reverse(str)); // Output: "olleh"
    }
}
