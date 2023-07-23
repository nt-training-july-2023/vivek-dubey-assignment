package task1;

public class NamingConvention {

	public static void main(String[] args) {
		// produces error because variable name can not start with a  number
		//  int 5ab = 5
		
		
		// A keyword cannot be used as an identifier.(class is keyword here)
		// int class = 5
		
		// identifiers are case sensitive so these two prints 5 and 10 respectively
		int ab = 5;
		int Ab = 10;
		System.out.println(ab);
		System.out.println(Ab);
		

	}

}
