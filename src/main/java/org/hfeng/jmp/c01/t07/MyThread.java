package org.hfeng.jmp.c01.t07;

public class MyThread extends Thread {
    private Data data;

    public MyThread(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            data.increase();
        }
    }
}
