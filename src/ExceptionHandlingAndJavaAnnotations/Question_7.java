package ExceptionHandlingAndJavaAnnotations;
import java.util.Scanner;


public class Question_7 {

	public static void main(String[] args) {
		
		int [] arr = {5,10,15,20,25,69,76,89};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index number which you want to access in the array:");
		int index = sc.nextInt();
		
		try {
            
            int ele = find(arr, index);
            System.out.println("Value at the index " + index + ": " + ele);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error:Index is invalid. The index must be between 0 and " + (arr.length - 1) + ".");
        } catch (NullPointerException e) {
            System.err.println("Error: The given array is null. Please provide an array with valid length.");
        }
    }
	
	public static int find(int[] arr, int index) throws IndexOutOfBoundsException, NullPointerException {
        

        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException();
        }
        
        if (arr == null) {
            throw new NullPointerException();
        }

        return arr[index];
    }
		
		
	}


