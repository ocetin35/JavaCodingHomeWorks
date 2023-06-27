package emre.week6;

public class PasswordValidation {

    public static boolean isValidPassword(String password) {

        // Check password length and presence of space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Check for uppercase, lowercase, digit, and special character
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }

        // Return the final result
        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }

    public static void main(String[] args) {
        String password = "Password123$";
        boolean isValid = isValidPassword(password);
        System.out.println("Is password valid? " + isValid);
    }
}

