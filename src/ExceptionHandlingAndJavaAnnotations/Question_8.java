package ExceptionHandlingAndJavaAnnotations;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question_8 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the path of file you want to read out:");
        String fName = sc.nextLine(); 

        readMethod(fName);
    }

    public static void readMethod(String fName) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(fName));
            String individualLine;
            while ((individualLine = bufferedReader.readLine()) != null) {
                
                System.out.println(individualLine);
            }
        } catch (IOException error) {
            System.err.println(  error.getMessage());
        } finally {
           
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException error) {
                System.err.println("There was an Error while closing the file: " +error.getMessage());
            }
        }
    }
}

