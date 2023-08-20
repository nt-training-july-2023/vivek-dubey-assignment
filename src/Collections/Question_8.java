package Collections;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Question_8 {

    public static void main(String[] args) {
        
        Collection<String> stringCollection = new LinkedHashSet<>();

        stringCollection.add("Vivek");
        stringCollection.add("Morris");
        stringCollection.add("Danny");
        stringCollection.add("Rahul");
        stringCollection.add("Dravid");
        stringCollection.add("Vivek"); // Ignored due to duplication
        stringCollection.add("Rajan");
        stringCollection.add("Sachin");
        stringCollection.add("Sourav");
        stringCollection.add("Badri");
        stringCollection.add("Dragon");
        stringCollection.add("Dormat");
        stringCollection.add("Morris"); // Ignored due to duplication
        stringCollection.add("Mint");
        stringCollection.add("Papaya");
        stringCollection.add("Sachin"); // Ignored due to duplication
        stringCollection.add("Strawberry");
        stringCollection.add("Watermelon");
        stringCollection.add("Blueberry");
        stringCollection.add("Raspberry");

        
        System.out.println("String Collection is :");
        for (String e : stringCollection) {
            System.out.println(e);
        }

        String searchEntry = "Sachin";
        boolean containsElement = stringCollection.contains(searchEntry);
        System.out.println("\nContains '" + searchEntry + "': " + containsElement);

        String removeElement = "Watermelon";
        boolean removed = stringCollection.remove(removeElement);
        System.out.println("Removed '" + removeElement + "': " + removed);

        System.out.println("\nString Collection after removal:");
        for (String element : stringCollection) {
            System.out.println(element);
        }
    }
}

