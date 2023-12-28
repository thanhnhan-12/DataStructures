package DataStructures.Array.Exercises;

import java.util.Arrays;

public class EvenNumbersAscending {
    public static void sortEvenNumbersAscending(int[] arr) {
        int[] evenNumbers = Arrays.stream(arr).filter(num -> num % 2 == 0).toArray();
        Arrays.sort(evenNumbers);

        int evenIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = evenNumbers[evenIndex++];
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 17, 4, 5, 11, 8, 2, 19 };
        System.out.println("Original Array: " + Arrays.toString(array));

        sortEvenNumbersAscending(array);
        System.out.println("Sorted even numbers in ascending order: " + Arrays.toString(array));
    }
}
