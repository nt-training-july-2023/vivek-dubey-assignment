package task2;

class Computer {

	   static class USB{
		   int usb = 1;
	       int usb2 = 3;
	       int usb3 = 1;
	       int returnTotalPorts(){
	           return usb +usb2 + usb3;
	       }
	   }

	}

public class StaticInnerClasses {

	public static void main(String[] args) {
		
	       Computer.USB usb = new Computer.USB();
	       System.out.println("Total number of USB Ports in Computer= " + usb.returnTotalPorts());
		

	}

}
