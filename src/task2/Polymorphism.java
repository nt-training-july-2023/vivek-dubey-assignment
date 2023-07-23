package task2;

	class Polygon {

	  public void definition() {
	    System.out.println("This is a polygon...");
	  }
	}

	class Rectangle extends Polygon {

	  public void definition() {
	    System.out.println("This is a rectangle...");
	  }
	}

	class Triangle extends Polygon {

	  public void definition() {
	    System.out.println("This is a Triangle...");
	  }
	}

	public class Polymorphism {

	public static void main(String[] args) {
		
	    Rectangle rectangle1 = new Rectangle();
	    rectangle1.definition();

	    Triangle triangle1 = new Triangle();
	    triangle1.definition();
		
	}

}
