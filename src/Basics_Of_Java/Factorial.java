package Basics_Of_Java;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ans = 1;
		
		System.out.println("Enter the value of number");
		int n = sc.nextInt();
		
		if(n<0) {
			System.out.println("factorial of negative numbers doesn't exist");
		}
		else if(n==0) {
			System.out.println("Factorial of 0 is 1");
		}
		else {
			while(n>0) {
				ans = ans*n;
				n = n-1;
			}
			System.out.println("Factorial of given number is " + ans);
		}
	}

}
