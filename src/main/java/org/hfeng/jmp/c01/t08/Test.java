package org.hfeng.jmp.c01.t08;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Ctor: main                                     //
// run(): Thread-0                                //
////////////////////////////////////////////////////
