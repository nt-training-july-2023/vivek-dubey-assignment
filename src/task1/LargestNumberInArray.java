package task1;

public class LargestNumberInArray {

	public static void main(String[] args) {
		
		  int length;
	      int array[] = {100, 205, 250, 603, 196, 157};
	      length = array.length;
	      int max = array[0];

	      for(int i = 1; i<length; i++ ){
	    	  
	    	  if(array[i] > max) {
	    		  // update value of max
	    		  max = array[i];
	    		  
	    	  }
	    	    
	      }
	      System.out.println("Largest element is:: "+ max);
		
	}

}
