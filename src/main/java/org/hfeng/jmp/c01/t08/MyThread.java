package org.hfeng.jmp.c01.t08;

public class MyThread extends Thread{
    public MyThread() {
        System.out.println("Ctor: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run(): " + Thread.currentThread().getName());
    }
}
