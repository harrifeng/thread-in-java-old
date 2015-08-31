package org.hfeng.jmdp.intro1.printthread;

public class Main {
    public static void main(String[] args) {
        new PrintThread("Good!").start();
        new PrintThread("Nice!").start();
        System.out.println("Ending of Main---------");
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Ending of Main---------                        //
// Nice!                                          //
// Nice!                                          //
// Nice!                                          //
// Nice!                                          //
// Nice!                                          //
// Nice!                                          //
// Nice!                                          //
// Nice!                                          //
// Nice!                                          //
// Nice!                                          //
// Good!                                          //
// Good!                                          //
// Good!                                          //
// Good!                                          //
// Good!                                          //
// Good!                                          //
// Good!                                          //
// Good!                                          //
// Good!                                          //
// Good!                                          //
////////////////////////////////////////////////////
