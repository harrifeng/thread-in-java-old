package org.hfeng.test.safe;

public class Main{
    public static void main(String[] args) {
        Data data = new Data(0);

        new UserThread(data).start();
        new UserThread(data).start();
    }
}
