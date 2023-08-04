package Basics_Of_Java;
import java.util.Scanner;
public class SumOfFirstNNumbers {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			sum += i;
		}
		
		System.out.println("Required sum is " + sum);
	}

}
