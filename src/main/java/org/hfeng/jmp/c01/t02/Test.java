package org.hfeng.jmp.c01.t02;

public class Test {
    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();
        //Thread.sleep(1000);
        System.out.println("Running Done!");
    }
}
