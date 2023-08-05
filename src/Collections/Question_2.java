package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Question_2 {

    public static void main(String[] args) {
    	
        // HashMap 
        System.out.println("HashMap :");
        Map<Integer, String> hashMap = new HashMap<>();
        crudMethod(hashMap);

        // LinkedHashMap 
        System.out.println("\nLinkedHashMap :");
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        crudMethod(linkedHashMap);
        
        // TreeMap 
        System.out.println("\nTreeMap :");
        Map<Integer, String> treeMap = new TreeMap<>();
        crudMethod(treeMap);
    }

    public static void crudMethod(Map<Integer, String> map) {
        // Create (Add) operation
        map.put(10, "Vivek");
        map.put(11, "Rajan");
        map.put(12, "Rahul");
        map.put(13, "Jimmy");

       
        System.out.println("Get operation performing:");
        System.out.println("Employee ID 11: " + map.get(11));

        
        System.out.println("\nUpdate operation performing:");
        map.put(11, "Stuart");
        System.out.println("Employee ID 11 has been (updated): " + map.get(10));

        
        System.out.println("\nRemove operation performing:");
        map.remove(12);
        System.out.println("Employee ID 12 has been (removed): " + map.get(12));

        
        System.out.println("\nAll entries in the map are:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}

