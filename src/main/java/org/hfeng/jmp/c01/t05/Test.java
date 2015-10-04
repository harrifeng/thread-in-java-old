package org.hfeng.jmp.c01.t05;

public class Test {
    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");
        a.start();
        b.start();
        c.start();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// B, count = 4                                   //
// B, count = 3                                   //
// B, count = 2                                   //
// B, count = 1                                   //
// B, count = 0                                   //
// C, count = 4                                   //
// A, count = 4                                   //
// A, count = 3                                   //
// A, count = 2                                   //
// A, count = 1                                   //
// A, count = 0                                   //
// C, count = 3                                   //
// C, count = 2                                   //
// C, count = 1                                   //
// C, count = 0                                   //
////////////////////////////////////////////////////
