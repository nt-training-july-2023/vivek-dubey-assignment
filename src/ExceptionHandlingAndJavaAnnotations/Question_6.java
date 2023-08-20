package ExceptionHandlingAndJavaAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        
        list.add("Hockey");
        list.add("Cricket");
        list.add("Football");
        list.add("Basketball");
        list.add("Volleyball");

        
        System.out.print("Enter the index of the string list you want to access: ");
        int indexNumber = sc.nextInt();

        try {
            
            String string = fetch(list, indexNumber);
            System.out.println("String at given index is " + indexNumber + ": " + string);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Index is invalid. The index should be between 0 and " + (list.size() - 1) + ".");
        } catch (NullPointerException e) {
            System.err.println("Error: The list is empty. Please provide a list of valid length.");
        }
    }

    public static String fetch(List<String> list, int index) throws IndexOutOfBoundsException, NullPointerException {
        

        if (index >= list.size() ||index < 0  ) {
            throw new IndexOutOfBoundsException();
        }
        
        if (list == null) {
            throw new NullPointerException();
        }

        return list.get(index);
    }
}

