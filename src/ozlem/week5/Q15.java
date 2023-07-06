package ozlem.week5;

// 1) String - Password Validation Task
//Write a return method that can verify if a password is valid or not. Requirements:
// 1. Password MUST be at least 6 characters and should not contain space
//Password should at least contain one upper case letter
//Password should at least contain one lowercase letter
//Password should at least contain one special characters
//Password should at least contain a digit
//if all requirements above are met, the method returns true, otherwise returns false
public class Q15 {

    public static boolean validPassport(String pass) {


        for (int i = 0; i < pass.length(); i++) {

            char p = pass.charAt(i);

            if (!Character.isLowerCase(p)) {
                return false;
            }

            if (!Character.isUpperCase(p)) {
                return false;
            }

            if (!Character.isLetterOrDigit(p)) {
                return false;
            }

            if (!Character.isDigit(p)) {
                return false;
            }

            if ((pass.length() < 6)) {
                return false;
            }



        }
            //&& (p <= 'Z' && p >= 'A') && (!Character.isLetterOrDigit(p) && (p <= 9 && p >= 0) && (pass.length() > 6) )){
              //  return true;
           // }

           // if(p == ' '){
                //return false;





       return true;

    }


    public static void main(String[] args) {
        System.out.println(Q15.validPassport(""));

    }

}