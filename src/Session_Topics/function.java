package Session_Topics;
import java.util.*;


public class function {
    public static void main(String[] args) {
        Example ex = new Example();

        Thread t1= new Thread(ex);
        Thread t2= new Thread(ex);

        t1.setName("first ");
        t2.setName("second ");

        t1.start();
        t2.start();
        try{

            synchronized (ex) {
                ex.notify();
            }
            t1.join();
            t2.join();
        }

        catch(InterruptedException e){
            System.err.println(e);
        }
        System.out.println("main end");

    }
}

class Example implements Runnable{
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            System.out.println(name+ "Thread is running");

            System.out.println(name +"Thread is sleeping..");
            Thread.sleep(2000);

            synchronized (this){
                System.out.println(name+ "Thread is waiting ");
                wait();
            }

            System.out.println(name +"end");

        }
        catch (InterruptedException e){
            System.out.println("Thread is interrupted");
        }
    }
}
