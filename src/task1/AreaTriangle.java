package task1;
import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the height:");
        double height= sc.nextDouble();
         
        System.out.println("Enter the width:");
        double width= sc.nextDouble();

               
        double area=(width*height)/2;
        System.out.println("Area of Triangle is: " + area);
	}

}
