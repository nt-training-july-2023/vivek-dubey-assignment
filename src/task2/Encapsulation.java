package task2;

class AreaOfRectangle {

	  int length;
	  int breadth;

	  AreaOfRectangle(int length, int breadth) {
	    this.length = length;
	    this.breadth = breadth;
	  }

	  public void findArea() {
	    int area = length * breadth;
	    System.out.println("Area of the rectangle is : " + area);
	  }
	}

public class Encapsulation {

	public static void main(String[] args) {
		
		AreaOfRectangle rectangle = new AreaOfRectangle(10, 8);
	    rectangle.findArea();

	}

}
