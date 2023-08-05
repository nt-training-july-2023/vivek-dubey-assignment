package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_6 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        map.put(1, "Vivek");
        map.put(2, "Morgs");
        map.put(3, "danny");
        map.put(4, "Dragon");

        int keyR = sc.nextInt();
        String valueR = sc.next();

        removeMethod(map, keyR, valueR);

        // Print the map after removal
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        sc.close();
    }

    public static void removeMethod(Map<Integer, String> map, int key, String value) {
        String actualValue = map.get(key);
        if (actualValue != null && actualValue.equals(value)) {
            map.remove(key);
            System.out.println("Key-Value pair which has been removed: Key " + key + ", Value " + value);
        } else {
            System.out.println("Key-Value pair is not removed because of mis-match: Key " + key + ", Value " + value);
        }
       
    }
}

