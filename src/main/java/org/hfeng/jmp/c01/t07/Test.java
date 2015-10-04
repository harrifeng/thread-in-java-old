package org.hfeng.jmp.c01.t07;

public class Test {
    public static void main(String[] args) {
        Data data = new Data(0);
        Thread a = new MyThread(data);
        Thread b = new MyThread(data);
        a.start();
        b.start();

        while (a.isAlive() || b.isAlive()) {
            ;
        }
        data.display();

    }
}
