package task1;
import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args)
	   {
	      String x, y;
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("Enter the First String: ");
	      x = sc.nextLine();
	      System.out.print("Enter the Second String: ");
	      y = sc.nextLine();
	      
	      x = x.concat(y);
	      System.out.println("\nFirst string after concatenation: " +x);
	   }

}
