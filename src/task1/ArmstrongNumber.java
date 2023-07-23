package task1;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a positive number");
		int number = sc.nextInt();
		int noOfDigits= 0;
		int result = 0;
		int remainder;
		int originalNumber = number;
		
		// finding number of digits in the number
		while(number!=0) {
			noOfDigits += 1;
			number = number/10;
			
	}
		number = originalNumber;
		while(number!=0) {
			remainder = number %10;
			result += Math.pow(remainder, noOfDigits);
			number /=10;
			
		}
		
		if(result == originalNumber)
            System.out.println(originalNumber + " is an Armstrong number.");
        else
            System.out.println(originalNumber + " is not an Armstrong number.");
		
		
	}
}
