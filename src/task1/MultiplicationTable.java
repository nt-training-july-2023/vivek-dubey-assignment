package task1;

import java.util.Scanner;
public class MultiplicationTable 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
	    System.out.print("Enter number:");        
	    int number=sc.nextInt();
        for(int j=1; j <= 10; j++)
        {
            System.out.println(number+" * "+j+" = "+number*j);
        }
    }
}
