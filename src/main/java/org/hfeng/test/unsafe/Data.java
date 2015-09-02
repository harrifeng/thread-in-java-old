package org.hfeng.test.unsafe;

public class Data {
    private int counter;
    public Data(int counter) {
        this.counter = counter;
    }

    public void addOne(){
        for (int i = 0; i < 100000; i++) {
            ;
        }
        counter++;
    }

    public void display() {
        System.out.printf("Counter:%d\n", counter);
    }
}
