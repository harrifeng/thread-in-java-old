package org.hfeng.jmp.c01.t04;

public class Test {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("Thread done!");
    }
}
