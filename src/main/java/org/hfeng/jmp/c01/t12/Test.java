package org.hfeng.jmp.c01.t12;

public class Test {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        System.out.println("begin=" + System.currentTimeMillis());
        mythread.start();
        System.out.println("end=" + System.currentTimeMillis());
    }
}

////////////////////////////////////////////////////////////////////
// <===================OUTPUT===================>                 //
// begin=1444311140948                                            //
// end=1444311140949                                              //
// run ThreadName= Thread[Thread-0,5,main] -begin()=1444311140949 //
// run ThreadName= Thread[Thread-0,5,main] -- end()=1444311142949 //
////////////////////////////////////////////////////////////////////
