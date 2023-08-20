package Basics_Of_Java;

 import java.util.Arrays;
 public class ArrayRotation {
	  public static void main(String[] args) {
	    int[] array = {20,21,22,23,25};     
	    int noOfPositions = 2;   
	    System.out.println("Original Array given is ");
	    System.out.println(Arrays.toString(array));
	    Rotation(array,noOfPositions);   
	    System.out.println("Reversed Array by 2 positions is");
	    System.out.println(Arrays.toString(array));
	  }
	    
	  public static void Rotation(int[] array, int noOfPositions) {
	    
	    if(noOfPositions==0 || noOfPositions%array.length==0)
	      return;
	    noOfPositions = noOfPositions%array.length;
	     
	    for(int j = 0 ; j<noOfPositions ; j++) {
	      int startingElement = array[0];
	      for(int k = 0 ; k < array.length - 1 ; k++) {
	        array[j] = array[j+1];
	      }
	      array[array.length-1] = startingElement;
	    }
	  }
	}
