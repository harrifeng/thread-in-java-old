package org.hfeng.jmp.c01.t12;

public class MyThread extends Thread{
    public void run() {
        try {
            System.out.println("run ThreadName= " + this.currentThread()
                               + " -begin()=" + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run ThreadName= " + this.currentThread()
                               + " -- end()=" + System.currentTimeMillis());
        }
        catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
            e.printStackTrace();
        }
    }
}
