package org.hfeng.jmp.c01.t11;

public class Test {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        System.out.println("begin=" + System.currentTimeMillis());
        mythread.run();
        System.out.println("end=" + System.currentTimeMillis());
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// begin=1444311227997                            //
// run ThreadName= Thread[main,5,main] -begin()   //
// run ThreadName= Thread[main,5,main] -- end()   //
// end=1444311229997                              //
////////////////////////////////////////////////////
