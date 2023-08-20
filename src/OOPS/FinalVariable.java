package OOPS;

public class FinalVariable {

	public static void main(String[] args) {
		
		// create a final variable
	    final int AGE = 22;

	    // try to change the final variable
	    // this produces error because final variable can not be reinitialized and
	    // we use it for objects which are not allowed to change once initialized
	    //AGE = 45;
	    System.out.println("Age value is : " + AGE);

	}

}
