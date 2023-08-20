package Collections;

import java.util.HashMap;
import java.util.Map;

public class Question_3 {

    private Map<Integer, String> map = new HashMap<>();
    private int thresholdSize;

    public Question_3(int thresholdSize) {
        this.thresholdSize = thresholdSize;
    }

    public void addEntry(int key, String value) {
        map.put(key, value);
        checkThresholdMethod();
    }

    private void checkThresholdMethod() {
        if (map.size() >= thresholdSize) {
            System.out.println("Threshold has been reached!! Showing and clearing the map:");
            showAndClearMethod();
        }
    }

    private void showAndClearMethod() {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Corresponding Value: " + entry.getValue());
        }
        map.clear();
    }

    public static void main(String[] args) {
        Question_3 obj = new Question_3(4);

        obj.addEntry(10, "Vivek");
        obj.addEntry(11, "Krishna");
        obj.addEntry(12, "Ojha");

        obj.addEntry(13, "Zubair"); 

        obj.addEntry(14, "Mohsin"); // Threshold has been reached, will show and then clear
        obj.addEntry(15, "Aditya");
    }
}

