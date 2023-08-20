package ExceptionHandlingAndJavaAnnotations;
import java.util.Scanner;

class InvalidInputException extends Exception {
    public InvalidInputException(String m) {
        super(m);
    }
}

public class Question_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        try {
            
            System.out.print("Enter your account Balance: ");
            double accountBalance = readInput(sc);

            System.out.print("Enter the amount you want to withdraw from your account: ");
            double withdrawalAmount = readInput(sc);

            
            if (accountBalance < 0 || withdrawalAmount < 0) {
                throw new InvalidInputException("accountBalance and withdrawal amount should not be non-negative.");
            }

            if (withdrawalAmount > accountBalance) {
                throw new InvalidInputException("Insufficient accountBalance.You Cannot withdraw more than what is in your account Balance.");
            }
            
         
            double remainingBalance = accountBalance - withdrawalAmount;
            System.out.println("Your Withdrawal is successfuly processed!");
            System.out.println("Remaining Balance in your account is : " + remainingBalance);
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}
        
 
        private static double readInput(Scanner sc) {
            while (!sc.hasNextDouble()) {
                System.out.println("Your input is invalid. Please enter a positive numeric value.");
                sc.next(); 
            }
            return sc.nextDouble();
        }
	
	}
