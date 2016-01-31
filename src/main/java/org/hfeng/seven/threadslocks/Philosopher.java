package org.hfeng.seven.threadslocks;

import java.util.Random;

/**
 * Created by hfeng on 2016/1/20.
 */
public class Philosopher extends Thread {
    private Chopstick left, right;
    private Random random;

    public Philosopher(Chopstick left, Chopstick right) {
        this.left = left;
        this.right = right;
        random = new Random();
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(random.nextInt(1000));
                synchronized (left) {
                    synchronized (right) {
                        Thread.sleep(random.nextInt(1000));
                    }
                }
            }
        } catch (InterruptedException e) {
        }
    }
}

class Chopstick {

}
