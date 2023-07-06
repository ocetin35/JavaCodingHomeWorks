package ozlem.week5;

public class PasswordValidator {
    public static boolean isValidPassword(String password) {
        // Requirement 1: Password must be at least 6 characters and should not contain space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Requirement 2: Password should contain at least one uppercase letter
        boolean hasUppercase = false;
        // Requirement 3: Password should contain at least one lowercase letter
        boolean hasLowercase = false;
        // Requirement 4: Password should contain at least one special character
        boolean hasSpecialChar = false;
        // Requirement 5: Password should contain at least one digit
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                // Assuming special characters are anything other than letters and digits
                hasSpecialChar = true;
            }
        }

        // Check if all requirements are met
        return hasUppercase && hasLowercase && hasSpecialChar && hasDigit;
    }

    public static void main(String[] args) {
        String password = "Password  123!";
        boolean isValid = isValidPassword(password);
        System.out.println("Is password valid? " + isValid);
    }
}