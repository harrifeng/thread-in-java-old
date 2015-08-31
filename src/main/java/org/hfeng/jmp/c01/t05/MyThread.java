package org.hfeng.jmp.c01.t05;

public class MyThread extends Thread {
    private int count = 5;

    public MyThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println(this.currentThread().getName() + ", count = " + count);
        }
    }
}
