package com.github.perschola;

public class Thread1 extends Thread{
    public Thread1() {

    }

    public void run(){
        for(int i = 1; i <= 4; i++){
            try{
                this.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

}
