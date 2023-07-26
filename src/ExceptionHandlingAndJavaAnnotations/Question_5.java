package ExceptionHandlingAndJavaAnnotations;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the path of source file: ");
        String source = sc.nextLine();

        System.out.print("Enter the path of destination file: ");
        String destination = sc.nextLine();

        try {
            
        	copyMethod(source, destination);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println( e.getMessage());
        }
    }

    public static void copyMethod(String source, String destination) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(source));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new IOException( e.getMessage());
        }
    }
}

