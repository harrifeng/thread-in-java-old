package org.hfeng.jmdp.intro1.printrunnable;

public class Main {
    public static void main(String[] args) {
        new Thread(new PrintRunnable("Good!")).start();
        new Thread(new PrintRunnable("Nice!")).start();
    }
}
