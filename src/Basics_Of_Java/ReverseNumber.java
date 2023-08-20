package Basics_Of_Java;
import java.util.Scanner;


public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be reversed:");
		int number = sc.nextInt();
		int reversed = 0;
		
		while(number!=0) {
			
			int remainder = number % 10;
			reversed = reversed*10 + remainder;
			number = number/10;
		}
		
		System.out.println("Reversed Number: " + reversed);
		
		
	}

}
