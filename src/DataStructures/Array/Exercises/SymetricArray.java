package DataStructures.Array.Exercises;

public class SymetricArray {
    public static boolean isSymmetric(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (arr[i] != arr[length - 1 - i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 2, 1 };
        int[] arr2 = { 1, 2, 3, 4, 5 };

        System.out.println("Is arr1 symmetric? " + isSymmetric(arr1));
        System.out.println("Is arr2 symmetric? " + isSymmetric(arr2));
    }
}
