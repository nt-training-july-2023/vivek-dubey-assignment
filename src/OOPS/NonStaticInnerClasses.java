package OOPS;

class CentralProcessingUnit {
    double price;
    
    
	protected class RandomAccessMemory{
	        
	        double memory;
	
	        double findClockSpeed(){
	            return 4.3;
	        }
	    }
    
    class MainProcessor{

        double cores;
        double findCache(){
            return 5.8;
        }
    }

    
}

public class NonStaticInnerClasses {

	public static void main(String[] args) {
		
		
        CentralProcessingUnit CentralProcessingUnit = new CentralProcessingUnit();
        CentralProcessingUnit.MainProcessor MainProcessor = CentralProcessingUnit.new MainProcessor();
        CentralProcessingUnit.RandomAccessMemory RandomAccessMemory = CentralProcessingUnit.new RandomAccessMemory();
        
        
        System.out.println("RandomAccessMemory's Clock speed is = " + RandomAccessMemory.findClockSpeed());
        System.out.println("MainProcessor Cache is = " + MainProcessor.findCache());
		
	}

}
