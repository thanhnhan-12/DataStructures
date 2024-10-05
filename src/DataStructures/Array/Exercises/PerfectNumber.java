package DataStructures.Array.Exercises;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }

        int sum = 1; 

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }

        return sum == number;
    }

    public static void main(String[] args) {
        int num = 6;

        if (isPerfectNumber(num)) {
            System.out.println(num + " is perfect number.");
        } else {
            System.out.println(num + " is not perfect number.");
        }
    }
}
