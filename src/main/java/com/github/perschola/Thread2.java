package com.github.perschola;

public class Thread2 extends Thread{
    public Thread2(){
    }

    public Thread2(String name){
        super(name);
    }

    public void run(){
        //System.out.println("Thread[Thread-"+this.getId()+","+this.getPriority()+","+this.getThreadGroup().getName()+"]");
        System.out.println("Thread["+this.getName()+","+this.getPriority()+","+this.getThreadGroup().getName()+"]");
        for(int i = 1; i <= 5; i++){
            try{
                this.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
