package org.hfeng.jmp.c01.t18;

public class MyThread extends Thread{
    public void run() {
        super.run();
        for (int i = 0; i < 20000; i++) {
            if (this.interrupted()){
                System.out.println("Already interrupted, stop now!");
                break;
            }
            System.out.println("i=" + (i+1));
        }
    }
}
