package org.hfeng.jmp.c01.t03;

public class Test {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.setName("myThread");
            thread.start();

            for (int i = 0; i < 5; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// main=main                                      //
// run=myThread                                   //
// main=main                                      //
// run=myThread                                   //
// main=main                                      //
// main=main                                      //
// run=myThread                                   //
// run=myThread                                   //
// run=myThread                                   //
// main=main                                      //
////////////////////////////////////////////////////
