package Java_IO;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Question_1 {
    public static void main(String[] args) {
        String inFile = "C:\\Users\\Vivek12\\eclipse-workspace\\JavaTask\\src\\Java_IO\\in.txt";
        String outFile = "C:\\Users\\Vivek12\\eclipse-workspace\\JavaTask\\src\\Java_IO\\reversed.txt";

        try {
            List<String> individualLines = readOperation(inFile);
            Collections.reverse(individualLines);
            writeOperation(outFile, individualLines);
            System.out.println("File has beem reversed successfully!");
        } catch (IOException IOException) {
            System.err.println("There was an error: " + IOException.getMessage());
        }
    }

    private static List<String> readOperation(String file) throws IOException {
        List<String> individualLines = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String individualLine;
            while ((individualLine = bufferedReader.readLine()) != null) {
                individualLines.add(individualLine);
            }
        }

        return individualLines;
    }

    private static void writeOperation(String file, List<String> individualLines) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (String individualLine : individualLines) {
                bufferedWriter.write(individualLine);
                bufferedWriter.newLine();
            }
        }
    }
}

