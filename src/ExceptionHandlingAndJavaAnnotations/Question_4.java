package ExceptionHandlingAndJavaAnnotations;


import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the path to the text file which you want to read: ");
        String fPath = sc.nextLine();

        try {
            
            readFile(fPath);
        } catch (IOException error) {
            System.out.println( error.getMessage());
        } catch (SecurityException error) {
            System.out.println(  error.getMessage());
        }
    }

    public static void readFile(String fPath) throws IOException, SecurityException {
       
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fPath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException error) {
            throw new IOException( error.getMessage());
        } catch (SecurityException error) {
            throw new SecurityException( error.getMessage());
        }
    }
}

