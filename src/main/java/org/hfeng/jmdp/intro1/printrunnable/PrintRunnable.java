package org.hfeng.jmdp.intro1.printrunnable;

public class PrintRunnable implements Runnable {
    private String message;

    public PrintRunnable(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(message);
        }
    }
}
