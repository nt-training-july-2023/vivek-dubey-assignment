package OOPS;

public class FinalBlankVariable {

    // Final blank variable declared
    final int finalBlankVariable;

    // Constructor to initialize the final blank variable
    public FinalBlankVariable(int val) {
        finalBlankVariable = val;
    }

    public void initializeVariable(int val) {
        //finalBlankVariable = val;
        // Error: because can not assign a value to final variable again after initializaion
    }

    public static void main(String[] args) {
        
        FinalBlankVariable finalBlankVariable= new FinalBlankVariable(4);

        
        System.out.println("Value of final blank variable is : " + finalBlankVariable.finalBlankVariable);
    }
}

//Other ways include initializing the variable inside instance initialization blocks
//or initializing it at the time of declaration for static final variables.

