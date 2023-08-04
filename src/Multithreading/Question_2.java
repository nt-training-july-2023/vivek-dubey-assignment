package Multithreading;

public class Question_2 {
    public static void main(String[] args) {
        
        Thread[] threads = new Thread[3];
        for (int j = 0; j < 3; j++) {
            threads[j] = new Thread(new myRunnable(j+1 ));
            threads[j].start();
        }

        
        while (checkMethod(threads)) {
            System.out.println("Checking the threads whether running or not...");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException error) {
                error.printStackTrace();
            }
        }

        System.out.println("All the threads are done with their execution.");
    }

    private static boolean checkMethod(Thread[] threads) {
        for (Thread th : threads) {
            if (th.isAlive()) {
                return true;
            }
        }
        return false;
    }

    private static class myRunnable implements Runnable {
        private int idThread;

        public myRunnable(int id) {
            this.idThread = id;
        }

        @Override
        public void run() {
            System.out.println("Thread " + idThread + " is started.");
            try {
                Thread.sleep(3000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread " + idThread + " has finished.");
        }
    }
}

