package org.hfeng.test.safe.unsafe;

public class UserThread extends Thread {
    private Data data;

    public UserThread(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            data.addOne();
        }
    }
}
