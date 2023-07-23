package Basics_Of_Java;
import java.util.Scanner;

public class RootsOfQuadraticEquation {

	public static void main(String[] args) {
		
		
		  double  firstRoot = 0,secondRoot = 0;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the value of coefficient of x^2 :");
	      double a = sc.nextDouble();

	      System.out.println("Enter the value of coefficient of x :");
	      double b = sc.nextDouble();

	      System.out.println("Enter the value of constant term :");
	      double c = sc.nextDouble();

	      double determinant = (b*b)-(4*a*c);
	      
	      if(determinant>0){
	          firstRoot = (-b + Math.sqrt(determinant))/(2*a);
	          secondRoot = (-b - Math.sqrt(determinant))/(2*a);
	          System.out.println("Roots are :: "+ firstRoot +" and "+secondRoot);
	       }else if(determinant == 0){
	          System.out.println("Root is :: "+(-b + Math.sqrt(determinant))/(2*a));
	       }
	       else
	       {
	    	   System.out.println("No real roots of the given quadratic equation");
	}

	}}
