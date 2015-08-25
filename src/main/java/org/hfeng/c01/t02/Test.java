package org.hfeng.c01.t02;

import org.hfeng.c01.t02.MyThread;

public class Test {
    public static void main(String[] args) throws Exception{
        MyThread myThread = new MyThread();
        myThread.start();
        //Thread.sleep(1000);
        System.out.println("Running Done!");
    }
}
