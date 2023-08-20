package Collections;

import java.util.HashMap;
import java.util.Map;

public class Question_5 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(201, "Vivek");
        map.put(202, "Morgan");
        map.put(203, "Gautam");
        map.put(204, "Yuvraj");
        map.put(205, "Raina");

        
        System.out.println("All Keys in the map respectively are:");
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        
        System.out.println("\nAll Values in the map respectively are:");
        for (String value : map.values()) {
            System.out.println(value);
        }
    }
}
