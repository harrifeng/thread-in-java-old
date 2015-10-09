package org.hfeng.jmp.c01.t17;

public class MyThread extends Thread{
    public void run() {
        super.run();
        for (int i = 0; i < 100000; i++) {
            System.out.println("i=" + (i+1));
        }
    }
}
