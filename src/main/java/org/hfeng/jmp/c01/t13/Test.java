package org.hfeng.jmp.c01.t13;

public class Test {
    public static void main(String[] args) {
        Thread runThread = Thread.currentThread();
        System.out.println(runThread.getName() + " " + runThread.getId());
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// main 1                                         //
////////////////////////////////////////////////////
