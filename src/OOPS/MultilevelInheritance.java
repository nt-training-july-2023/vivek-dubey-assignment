package OOPS;

	class Watch
	{
	    void display()
	    {
	        System.out.println("Displaying the watch");
	    }
	}
	class Rolex extends Watch
	{
	    void property()
	    {
	        System.out.println("This is Rolex watch");        
	    }
	}
	class Martin extends Rolex
	{
	    void type()
	    {
	        System.out.println("This is of Martin type");
	        System.out.println("It's a Classic Collection");
	    }
	}

	public class MultilevelInheritance {
	
		public static void main(String[] args) {
			
			Martin martin1 = new Martin();
			martin1.display();
			martin1.property();
			martin1.type();
			
		}
	
	}

