package org.hfeng.jmp.c01.t17;

public class Test {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            // iSInterrupted is NOT static method
            System.out.println("IsInterrupted? 1= " + thread.isInterrupted());
            System.out.println("IsInterrupted? 2= " + thread.isInterrupted());
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
// i=7921                                         //
// IsInterrupted? 1= true                         //
// i=7922                                         //
// i=7923                                         //
// i=7924                                         //
// i=7925                                         //
// IsInterrupted? 2= true                         //
// i=7926                                         //
////////////////////////////////////////////////////
