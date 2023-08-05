package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_7 {

    public static void main(String[] args) {
        
        List<Integer> listOfIntegers = new ArrayList<>();
        for (int j = 0; j < 20; j++) {
            listOfIntegers.add((int) (Math.random() * 100)); // Adding random integers
        }

        System.out.println("The original list of random integers is: " + listOfIntegers);

        Collections.reverse(listOfIntegers);
        System.out.println("The reversed list is: " + listOfIntegers);

        listOfIntegers.replaceAll(num -> num > 50 ? num + 5 : num);
        System.out.println("The modified list is: " + listOfIntegers);

        List<Integer> lessThanSixty = new ArrayList<>();
        for (Integer num : listOfIntegers) {
            if (num < 60) {
                lessThanSixty.add(num);
            }
        }
        System.out.println("Elements less than 60: " + lessThanSixty);
    }
}

