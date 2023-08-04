package Basics_Of_Java;

public class additionOfMatrices{
	   public static void main(String args[]){
	      int a[][]={{10,20,23},{40,15,16},{17,28,19}};
	      int b[][]={{10,21,51},{31,71,51},{18,61,16}};
	      int c[][]=new int[3][3];
	      
	      // printing the two matrices first
	      System.out.println("First matrix is :");
	      for(int i =0; i<3; i++) {
	    	  for(int j=0; j<3; j++) {
	    		  System.out.print(a[i][j]+" ");
	    		  
	    	  }
	    	  System.out.println();
	      }
	      
	      System.out.println("Second matrix is:");
	      for(int i =0; i<3; i++) {
	    	  for(int j=0; j<3; j++) {
	    		  System.out.print(b[i][j]+" ");
	    		  
	    	  }
	    	  System.out.println();
	      }
	      
	      System.out.println("Resultant matrix after addition is :");

	      for(int i = 0;i<3;i++){
	         for(int j = 0;j<3;j++){
	            c[i][j] = a[i][j]+b[i][j];
	            System.out.print(c[i][j]+" ");
	         }
	         System.out.println();
	      }
	   }
	}
