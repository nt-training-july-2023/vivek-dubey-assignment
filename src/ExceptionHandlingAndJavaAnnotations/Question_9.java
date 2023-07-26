package ExceptionHandlingAndJavaAnnotations;

import java.util.InputMismatchException;
import java.util.Scanner;

class NotEvenNumberException extends Exception {
    public NotEvenNumberException(String m) {
        super(m);
    }
}

public class Question_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Please enter an integer: ");
            int number = sc.nextInt();

            if (number%2 == 0) {
                System.out.println("THIS IS AN EVEN NUMBER");
            } else {
                throw new NotEvenNumberException("THIS IS NOT AN EVEN NUMBER");
            }
        } catch (InputMismatchException error) {
            System.err.println("Error: Your input is invalid. Please enter a valid integer.");
        } catch (NotEvenNumberException error) {
            System.err.println( error.getMessage());
        }
    }

    
}

