package Basics_Of_Java;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbersInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int value;
		int sum=0;
		double average = 0;
		
		List<Integer> values = new ArrayList<Integer>();
		
		for(int i=0; i<size; i++) {
			value = sc.nextInt();
		    values.add(value);
		    sum += value;

	}
		
		average = sum/size;
		
		System.out.println("Average of numbers is "+ average);

}
}
