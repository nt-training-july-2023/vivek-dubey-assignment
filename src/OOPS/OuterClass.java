package OOPS;

public class OuterClass {
   
    static int staticVariable = 50;

   
    int instanceVariable = 100;

    // Static nested class
    static class StaticNestedClass {
        void accessOuterStatic() {
            System.out.println("StaticNestedClass has direct access to-  outer class's  staticVariable: " + staticVariable);
            //  can access the outer class's static variable directly
        }

        void accessOuterInstance(OuterClass outer) {
            System.out.println("StaticNestedClass has access to  outer instance variable whose value is: " + outer.instanceVariable);
            //  can access the outer class's instance variable using an instance of the outer class
        }

        
        void nonStaticMethod() {
            System.out.println("Non-static method in StaticNestedClass is called.");
            // StaticNestedClass cannot access outer class's non-static (instance) variables/methods directly
            // The below line would result in a compilation error
            // System.out.println("StaticNestedClass accessing outer instance variable: " + instanceVariable);
        }
    }

    public static void main(String[] args) {
        // Accessing the static nested class and its methods
        StaticNestedClass staticNestedObject = new StaticNestedClass();
        staticNestedObject.accessOuterStatic();

        // Creating an instance of the outer class to pass to the nested class's method
        OuterClass outerObj = new OuterClass();
        staticNestedObject.accessOuterInstance(outerObj);

        // Attempting to call the non-static method in the static nested class
        // This will result in a compilation error because the non-static method cannot be accessed directly
        // nestedObj.nonStaticMethod();
    }
}

