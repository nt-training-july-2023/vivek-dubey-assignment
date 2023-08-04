package OOPS;

public class StaticVariableExample {
    
    static int instanceCount = 0;
    int instanceNumber;

    public StaticVariableExample() {
        
        instanceNumber = ++instanceCount;
    }

    public void show() {
        System.out.println(" Number of instances: " + instanceNumber + ", Total number of  Instances: " + instanceCount);
    }

    public static void main(String[] args) {
        
        StaticVariableExample staticVariableExample1 = new StaticVariableExample();
        StaticVariableExample staticVariableExample2 = new StaticVariableExample();
        StaticVariableExample staticVariableExample3 = new StaticVariableExample();
        StaticVariableExample staticVariableExample4 = new StaticVariableExample();

       
        staticVariableExample1.show(); 
        staticVariableExample2.show(); 
        staticVariableExample3.show(); 
        staticVariableExample4.show();
        System.out.println("Total number of instances created: " + StaticVariableExample.instanceCount); 
    }
}
