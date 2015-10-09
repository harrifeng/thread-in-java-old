package org.hfeng.jmp.c01.t18;

public class Test {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        }
        catch (Throwable e) {
            System.out.println("Error " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// ...                                            //
// i=15103                                        //
// i=15104                                        //
// i=15105                                        //
// end!                                           //
// Already interrupted, stop now!                 //
////////////////////////////////////////////////////
