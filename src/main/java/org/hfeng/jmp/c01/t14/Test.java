package org.hfeng.jmp.c01.t14;

public class Test {
    public static void main(String[] args) {
        try {
            MyThread mythread = new MyThread();
            mythread.start();
            Thread.sleep(2000);
            mythread.interrupt();
        }
        catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
            e.printStackTrace();
        }
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// ...                                            //
// ...                                            //
// i=4998                                         //
// i=4999                                         //
// i=5000                                         //
////////////////////////////////////////////////////
