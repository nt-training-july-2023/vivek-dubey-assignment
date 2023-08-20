package OOPS;

public class StaticBlock {
	
	static int staticVariable;
    
    static {
        System.out.println("First Static Block has been executed.");
        staticVariable = 5;
    }

     
    static {
        System.out.println("Second Static Block has been executed.");
        staticVariable *= 4;
    }

	public static void main(String[] args) {
		
		System.out.println("Main method has been executed.");
        System.out.println("Static Variable value is: " + staticVariable);
		
	}

}
