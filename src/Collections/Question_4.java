package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_4 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(100, "Vivek");
        map.put(101, "Morris");
        map.put(102, "Anderson");
        map.put(103, "Daniel");
        
        Scanner sc = new Scanner(System.in);

        
        int checkKey = sc.nextInt();
        if (map.containsKey(checkKey)) {
            System.out.println("The given Map contains the key: " + checkKey);
        } else {
            System.out.println("The given Map does not contain the key: " + checkKey);
        }

//        sc.next();
        String valueToCheck = sc.next();
        if (map.containsValue(valueToCheck)) {
            System.out.println("The given Map contains value: " + valueToCheck);
        } else {
            System.out.println("The given Map does not contain value: " + valueToCheck);
        }
        sc.close();
    }
}

