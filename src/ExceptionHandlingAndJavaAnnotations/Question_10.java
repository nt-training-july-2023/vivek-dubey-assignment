package ExceptionHandlingAndJavaAnnotations;
import java.util.Scanner;

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String m) {
        super(m);
    }
}

public class Question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a password of your choice: ");
            String pass = sc.nextLine();

            if (isValid(pass)) {
                System.out.println("Password that you have entered is valid.");
            } else {
                throw new InvalidPasswordException("Invalid !! Password must have at least eight characters and must contain both letters and numbers.");
            }
        } catch (InvalidPasswordException error) {
            System.err.println(error.getMessage());
        }
    }

    public static boolean isValid(String pass) {
        if (pass == null || pass.length() < 8) {
            return false;
        }

        boolean hasNumber = false;
        boolean hasLetter = false;

        for (char ch : pass.toCharArray()) {
             if (Character.isDigit(ch)) {
                hasNumber = true;
            }else if (Character.isLetter(ch)) {
                hasLetter = true;
            }
        }

        return hasLetter && hasNumber;
    }
}

