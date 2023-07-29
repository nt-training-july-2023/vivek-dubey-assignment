package Multithreading;

import java.util.LinkedList;
import java.util.Queue;

class MsgQueue {
    private final Queue<String> msgs = new LinkedList<>();

    public synchronized void insertNewMsg(String msg) {
        msgs.add(msg);
        notifyAll(); 
    }

    public synchronized String retreiveMsg() throws InterruptedException {
        while (msgs.isEmpty()) {
            wait(); 
        }
        return msgs.poll();
    }
}

class MsgReader extends Thread {
    private final MsgQueue MsgQueue;
    private final int idOfReader;

    public MsgReader(MsgQueue MsgQueue, int idOfReader) {
        
        this.idOfReader = idOfReader;
        this.MsgQueue = MsgQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String message = MsgQueue.retreiveMsg();
                System.out.println("Reader " + idOfReader + " has received message: " + message);
                Thread.sleep(2000); 
                System.out.println("Reader " + idOfReader + " has acknowledged message: " + message);
            }
        } catch (InterruptedException e) {
            System.err.println("Reader " + idOfReader + " has been interrupted.");
        }
    }
}

public class Question_4 {
    public static void main(String[] args) {
        MsgQueue MsgQueue = new MsgQueue();

        
        MsgReader firstReader = new MsgReader(MsgQueue, 1);
        MsgReader secondReader = new MsgReader(MsgQueue, 2);
        MsgReader thirdReader = new MsgReader(MsgQueue, 3);
        MsgReader fourthReader = new MsgReader(MsgQueue, 4);
        MsgReader fifthReader = new MsgReader(MsgQueue, 5);


        firstReader.start();
        secondReader.start();
        thirdReader.start();
        fourthReader.start();
        fifthReader.start();
        
        for (int i = 1; i <= 15; i++) {
            String message = "Hello this is the message number " + i;
            MsgQueue.insertNewMsg(message);
        }
    }
}

