package task1;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a positive number");
		int number = sc.nextInt();
		
		int originalNumber = number;
		int reversed = 0;
		
        while(number!=0) {
			
			int remainder = number % 10;
			reversed = reversed*10 + remainder;
			number = number/10;
		}
        
        if(reversed == originalNumber ) {
        	System.out.println("Given number is palindrome");
        }
        else
        	System.out.println("It's not a palindrome");
		

	}

}
