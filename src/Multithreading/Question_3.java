package Multithreading;


import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer which is positive : ");
        int k = sc.nextInt();
        sc.close();

        if (k <= 0) {
            System.out.println("Please enter x positive integer.");
            return;
        }

     
        // creating instances using lamda expression as Runnable is a functional interface
        Runnable taskOfFibonacci = () -> fibonacci(k);
        Runnable taskOfSum = () -> sum(k);
        Runnable taskOfReversing = () -> reverse(k);

     
        
        Thread threadFibonacci = new Thread(taskOfFibonacci);
        Thread threadSum = new Thread(taskOfSum);
        Thread threadReverse = new Thread(taskOfReversing);

        
        
        threadFibonacci.start();
        threadSum.start();
        threadReverse.start();
    }

    private static void reverse(int k) {
        List<Integer> noList = new ArrayList<>();
        for (int j = 1; j <= k; j++) {
            noList.add(j);
        }
        System.out.println("The original list is: " + noList);
        Collections.reverse(noList);
        System.out.println("The reversed list is: " + noList);
    }
    
    private static void sum(int k) {
        int sum = k * (k + 1) / 2;
        System.out.println("Sum of numbers from 1 to " + k + ": is " + sum);
    }

    private static void fibonacci(int k) {
        List<Integer> seqFibonacci = new ArrayList<>();
        seqFibonacci.add(0);
        if (k > 0) {
            seqFibonacci.add(1);
        }
        int x = 0, y = 1, z;
        while (true) {
            z = x + y;
            if (z <= k) {
                seqFibonacci.add(z);
                x = y;
                y = z;
            } else {
                break;
            }
        }
        System.out.println("Fibonacci sequence up to the number " + k + ": " + seqFibonacci);
    }

   
}

