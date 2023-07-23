package task2;

public class StaticMethod {
    
    static int staticVariable = 5;

    
    int instanceVariable = 15;

    
    static void staticMethod() {
        System.out.println("Static method has been called.");
        System.out.println("The Static variable value is: " + staticVariable);

        //error 
        // System.out.println("Instance variable value: " + instanceVariable);
        // Modifying the static variable possible because it's static
        staticVariable = 40;
        System.out.println("Static variable's modified value is : " + staticVariable);
    }

    public static void main(String[] args) {
        // we can call static method directly using class name only
        StaticMethod.staticMethod();

    }
}

