package Multithreading;

class multithreading extends Thread{
	
	public void run(){
		try {
			System.out.println("Thread" + " " +Thread.currentThread().getId() +" is running");
		}
		catch(Exception error){
			System.out.println("Exception has been caught.");
			
		}
	}
}

public class Question_1 {

	public static void main(String[] args) {
		int k = 3;
		for (int i = 0; i < k; i++) {
            multithreading obj
                = new multithreading();
            obj.start();
        }
	}
}
