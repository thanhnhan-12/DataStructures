package DataStructures.Array.Exercises;

public class PasswordValidator {
    public static boolean isValidPassword(String password) {
        // Kiểm tra độ dài của mật khẩu
        if (password.length() < 8) {
            return false;
        }

        // Kiểm tra xem mật khẩu có chứa ký tự đặc biệt không
        if (!password.matches(".*[@#$%^&+=].*")) {
            return false;
        }

        // Kiểm tra xem mật khẩu có chứa chữ hoa, chữ thường và số không
        if (!password.matches(".*[A-Z].*") || !password.matches(".*[a-z].*") || !password.matches(".*\\d.*")) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String password = "MyPassword@123";

        if (isValidPassword(password)) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Password is incorrect");
        }
    }
}
