package Basics_Of_Java;
import java.util.Scanner;

public class ArithmeticOperators {

   public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the first number :");
        int num_1 = sc.nextInt();
        System.out.println("Enter the second number :");
        int num_2 = sc.nextInt();
        

        
        int sum 		= num_1 + num_2;
        int difference 	= num_1 - num_2;
        int product 	= num_1 * num_2;
        int quotient	= num_1 / num_2;
        int modulo	    = num_1 % num_2;
        

       
        System.out.println("Sum is : "         + sum);
        System.out.println("Difference is : "  + difference);
        System.out.println("Product is : "     + product);
        System.out.println("Quotient is : "    + quotient);
        System.out.println("Modulo is : "      + modulo);
    }
}
