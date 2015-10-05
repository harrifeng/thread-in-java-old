package org.hfeng.test.safe;

public class Data {
    private int counter;
    public Data(int counter) {
        this.counter = counter;
    }

    public synchronized void addOne(){
        for (int i = 0; i < 100000; i++) {
            ;
        }
        counter++;
        display();
    }

    public synchronized void display() {
        System.out.printf("Counter:%d\n", counter);
    }
}
