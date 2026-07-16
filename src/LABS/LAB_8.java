package LABS;
//Multithreading syncronized methods

class Restaurant {

    synchronized void foodOrder(String orderName) {
        System.out.println("Thread waiter: customer has ordered " + orderName);
    }

    synchronized void cookedOrder(String orderName) {
        System.out.println("Thread cook: chef has received the ordered " + orderName);
        System.out.println("Thread cook: cooking under progress");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread cook: Order is ready");
    }

    synchronized void receivedOrder(String orderName) {
        System.out.println("Thread waiter: food is delivered to customer");
        System.out.println("Thread customer: customer had received the order: " + orderName);
    }
}

class Example implements Runnable {

    static Restaurant r = new Restaurant();

    @Override
    public void run() {

        String name = Thread.currentThread().getName();

        if (name.equals("customer")) {
            System.out.println("Thread customer: customer is checking an order");
        }

        else if (name.equals("waiter")) {
            r.foodOrder("Chicken Biriyani");
        }

        else if (name.equals("cook")) {
            r.cookedOrder("Chicken Biriyani");
            r.receivedOrder("Chicken Biriyani");
        }
    }
}

public class LAB_8 {

    public static void main(String[] args) {

        Example ex = new Example();

        Thread customer = new Thread(ex);
        Thread waiter = new Thread(ex);
        Thread cook = new Thread(ex);

        customer.setName("customer");
        waiter.setName("waiter");
        cook.setName("cook");

        try {
            customer.start();
            customer.join();

            waiter.start();
            waiter.join();

            cook.start();
            cook.join();

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}