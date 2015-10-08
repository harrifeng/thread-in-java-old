package org.hfeng.jmp.c01.t11;

public class MyThread extends Thread{
    public void run() {
        try {
            System.out.println("run ThreadName= " + this.currentThread()
                               + " -begin()");
            Thread.sleep(2000);
            System.out.println("run ThreadName= " + this.currentThread()
                               + " -- end()");
        }
        catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
            e.printStackTrace();
        }
    }
}
