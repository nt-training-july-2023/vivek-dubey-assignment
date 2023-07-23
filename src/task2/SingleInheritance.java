package task2;

	class Shape{
	    void drawShape()
	    {
	        System.out.println("Drawing Shape...");
	    }
	}
	class Parabola extends Shape
	{
	    void drawParabola(){
	        System.out.println("Drawing Parabola...");
	    }
	    }

	public class SingleInheritance {
		
		public static void main(String[] args) {
			
			Parabola parabola  = new Parabola();
		    parabola.drawShape();
		    parabola.drawParabola();
			
		}
	
	}
