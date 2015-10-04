package org.hfeng.jmp.c01.t07;

public class Data {
    private int count;

    public Data(int count) {
        this.count = count;
    }

    public void increase() {
        this.count++;
    }

    public void display() {
        System.out.println("Count is now: " + count);
    }
}
