package DataStructures.Array.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrangePrimeNumbers {
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

    public static int[] filterPrimes(int arr[]) {
        List<Integer> primesList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                primesList.add(arr[i]);
            }
        }

        int[] primesArray = new int[primesList.size()];
        for (int i = 0; i < primesList.size(); i++) {
            primesArray[i] = primesList.get(i);
        }
        return primesArray;
    }

    public static void arrangePrimeNumbers(int arr[]) {
        int[] primes = filterPrimes(arr);
        Arrays.sort(primes);
        
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                arr[i] = primes[index++];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 17, 4, 5, 11, 8, 2, 19 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        int[] prime =  filterPrimes(arr);
        System.out.println("Arrange the prime numbers in filter: " + Arrays.toString(prime));
        arrangePrimeNumbers(prime);
        System.out.println("Arrange the prime numbers in ascending order: " + Arrays.toString(prime));
    }
}
