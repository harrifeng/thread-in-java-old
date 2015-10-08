package org.hfeng.jmp.c01.t14;

public class MyThread extends Thread{
    public void run() {
        super.run();
        for (int i = 0; i < 5000; i++) {
            System.out.println("i=" + (i+1));
        }
    }
}
