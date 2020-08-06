package com.github.perschola;

public class Thread4 extends Thread{
    public Thread4(String name){
        super(name);
    }

    public void run(){
        for (int i = 0; i < 3; i++) {
            try {
                this.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("running thread name is:"+this.getName());
            System.out.println("running thread priority is:"+this.getPriority());
            System.out.println("=======================================");
        }

    }
}
