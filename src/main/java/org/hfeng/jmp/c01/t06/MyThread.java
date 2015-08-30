package org.hfeng.jmp.c01.t06;

public class MyThread extends Thread{
    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println(this.currentThread().getName() + " count=" + count);
    }
}
