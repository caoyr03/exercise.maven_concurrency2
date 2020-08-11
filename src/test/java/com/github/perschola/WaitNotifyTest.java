package com.github.perschola;

public class WaitNotifyTest {
    public static void main(String[] args){
        Message message = new Message("process it");
        Waiter waiter1 = new Waiter(message);
        Thread thread1 = new Thread(waiter1, "waiter1");
        Waiter waiter2 = new Waiter(message);
        Thread thread2 = new Thread(waiter2, "waiter2");
        Notifier notifier = new Notifier(message);
        Thread thread3 = new Thread(notifier,"notifier");

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("All threads are started");
    }
}
