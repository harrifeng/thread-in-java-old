package org.hfeng.jmdp.ch01.gateunsafe;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Gate, hit CTRL+C to exit.");
        Gate gate = new Gate();
        new UserThread(gate, "Alice", "Alaska").start();
        new UserThread(gate, "Bobby", "Brazil").start();
        new UserThread(gate, "Chris", "Canada").start();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Alice BEGIN                                    //
// Bobby BEGIN                                    //
// Chris BEGIN                                    //
// **** BROKEN ****No.254: Alice, Alaska          //
// **** BROKEN ****No.364: Chris, Canada          //
// **** BROKEN ****No.285022: Chris, Canada       //
// **** BROKEN ****No.285126: Chris, Canada       //
// **** BROKEN ****No.286702: Chris, Canada       //
// **** BROKEN ****No.287216: Bobby, Canada       //
////////////////////////////////////////////////////
