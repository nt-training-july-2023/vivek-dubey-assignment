package Collections;

import java.util.HashMap;
import java.util.Map;

public class Question_1 {

    private Map<Integer, String> empMap = new HashMap<>();

    
    public void addEmployee(int empId, String empName) {
        empMap.put(empId, empName);
    }

    
    public void printMethod(String stringForSearch) {
        for (Map.Entry<Integer, String> entry : empMap.entrySet()) {
            if (entry.getValue().contains(stringForSearch)) {
                System.out.println("The Employee ID is: " + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Question_1 Question_1 = new Question_1();

        
        Question_1.addEmployee(10, "Vivek Dubey");
        Question_1.addEmployee(11, "Rahul Dubey");
        Question_1.addEmployee(15, "Rajan Dubey");
        Question_1.addEmployee(12, "Stuart Broad");
        Question_1.addEmployee(13, "James Anderson");
        Question_1.addEmployee(14, "AB De Villiers");

        
        String stringForSearch = "Dubey";
        System.out.println("All the Employees with name which contains '" + stringForSearch + "':");
        Question_1.printMethod(stringForSearch);
    }
}

