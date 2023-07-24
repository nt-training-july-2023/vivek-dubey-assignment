package ExceptionHandlingAndJavaAnnotations;


import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface CalculateArea {}

class Design {
    
    @CalculateArea
    public static double areaOfCircle(double r) {
        return Math.PI * r * r;
    }
  
    @CalculateArea
    public static double areaOfTriangle(double b, double h) {
        return 0.5 * b * h;
    }
    
    @CalculateArea
    public static double areaOfRectangle(double l, double w) {
        return l * w;
    }

}

public class Question_1 {
	
	public static void main(String[] args) {
        
        double radius = 7.0;
        double base = 5.0;
        double height = 9.0;
        double length = 10.0;
        double width = 7.0;

        
        double areaOfCircle = Design.areaOfCircle(radius);
        double areaOfTriangle = Design.areaOfTriangle(base, height);
        double areaOfRectangle = Design.areaOfRectangle(length, width);

        
        System.out.println("Area of Circle is: " + areaOfCircle);
        System.out.println("Area of Triangle is: " + areaOfTriangle);
        System.out.println("Area of Rectangle is: " + areaOfRectangle);
    }

}
