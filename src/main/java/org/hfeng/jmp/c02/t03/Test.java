package org.hfeng.jmp.c02.t03;

public class Test {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();

        ThreadA threadA = new ThreadA(numRef1);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef2);
        threadB.start();
    }
}
