package org.hfeng.jmp.c01.t15;

public class Test {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            // interrupted is static method
            System.out.println("Interrupted? 1= " + Thread.interrupted());
            System.out.println("Interrupted? 2= " + Thread.interrupted());
        }
        catch (InterruptedException e) {
            System.out.println("Error " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// ...                                            //
// i=4999                                         //
// i=5000                                         //
// Interrupted? 1= false                          //
// Interrupted? 2= false                          //
// end!                                           //
////////////////////////////////////////////////////
