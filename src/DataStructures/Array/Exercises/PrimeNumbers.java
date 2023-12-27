package DataStructures.Array.Exercises;

public class PrimeNumbers {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumPrimeNumbers(int arr[]) {
        int Sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                Sum += arr[i];
            }
        }

        return Sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 7, 11 };
        int result = sumPrimeNumbers(arr);
        System.out.println("Sum of Prime Numbers: " + result);
    }
}
