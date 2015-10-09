package org.hfeng.jmp.c01.t16;

public class Test {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("Interrupted? 1= " + Thread.interrupted());
        System.out.println("Interrupted? 2= " + Thread.interrupted());
        System.out.println("end!");
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Interrupted? 1= true                           //
// Interrupted? 2= false                          //
// end!                                           //
////////////////////////////////////////////////////
