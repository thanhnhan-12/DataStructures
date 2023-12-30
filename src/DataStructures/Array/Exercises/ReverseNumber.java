package DataStructures.Array.Exercises;

public class ReverseNumber {
    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10; // Lấy chữ số cuối cùng của số ban đầu
            reversed = reversed * 10 + digit; // Thêm chữ số vào số đã đảo ngược
            number /= 10; // Loại bỏ chữ số cuối cùng từ số ban đầu
        }

        return reversed;
    }

    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverse(number);

        System.out.println("Số đảo ngược của " + number + " là: " + reversedNumber);
    }
}
