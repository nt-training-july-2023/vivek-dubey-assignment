package ExceptionHandlingAndJavaAnnotations;

class InvalidDimensionException extends Exception {
    public InvalidDimensionException(String m) {
        super(m);
    }
}

class calculateRectangleArea {
    public static int areaCalculator(int l, int w) throws InvalidDimensionException {
        if (l <= 0 || w <= 0) {
            throw new InvalidDimensionException("Dimensions are invalid: length and width should be positive integers.");
        }
        return l * w;
    }
}

public class Question_3 {

	public static void main(String[] args) {
		
	        try {
	            int l = 6;
	            int w = 12;

	            int area = calculateRectangleArea.areaCalculator(l, w);
	            System.out.println("Area of the rectangle: " + area);

	            
	            int invalidLength = 0;
	            int invalidWidth = -12;

	            int invalidArea = calculateRectangleArea.areaCalculator(invalidLength, w); // throws exception
	            System.out.println("Rectangle area is : " + invalidArea);
	        } catch (InvalidDimensionException e) {
	            System.out.println("An Exception has occurred: " + e.getMessage());
	        }
		}
	
		
		
	}
	


