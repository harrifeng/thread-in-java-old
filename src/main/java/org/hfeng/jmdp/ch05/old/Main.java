package org.hfeng.jmdp.ch05.old;

public class Main {
    public static void main(String[] args) {
        Table table = new Table(3); // a table can hold three cakes

        new MakerThread("MakerThread-1", table, 31415).start();
        new MakerThread("MakerThread-2", table, 92653).start();
        new MakerThread("MakerThread-3", table, 58979).start();
        new EaterThread("EaterThread-1", table, 32384).start();
        new EaterThread("EaterThread-2", table, 62643).start();
        new EaterThread("EaterThread-3", table, 38327).start();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// MakerThread-2 puts [Cake No.0byMakerThread-2   //
// EaterThread-3 takes [Cake No.0byMakerThread-2  //
// MakerThread-1 puts [Cake No.1byMakerThread-1   //
// EaterThread-1 takes [Cake No.1byMakerThread-1  //
// MakerThread-3 puts [Cake No.2byMakerThread-3   //
// EaterThread-2 takes [Cake No.2byMakerThread-3  //
// MakerThread-2 puts [Cake No.3byMakerThread-2   //
// EaterThread-3 takes [Cake No.3byMakerThread-2  //
// MakerThread-3 puts [Cake No.4byMakerThread-3   //
// EaterThread-3 takes [Cake No.4byMakerThread-3  //
// MakerThread-1 puts [Cake No.5byMakerThread-1   //
// EaterThread-2 takes [Cake No.5byMakerThread-1  //
// MakerThread-2 puts [Cake No.6byMakerThread-2   //
// EaterThread-1 takes [Cake No.6byMakerThread-2  //
// MakerThread-3 puts [Cake No.7byMakerThread-3   //
// EaterThread-3 takes [Cake No.7byMakerThread-3  //
// MakerThread-1 puts [Cake No.8byMakerThread-1   //
// EaterThread-3 takes [Cake No.8byMakerThread-1  //
// MakerThread-2 puts [Cake No.9byMakerThread-2   //
// EaterThread-2 takes [Cake No.9byMakerThread-2  //
// MakerThread-1 puts [Cake No.10byMakerThread-1  //
// EaterThread-1 takes [Cake No.10byMakerThread-1 //
// MakerThread-1 puts [Cake No.11byMakerThread-1  //
// EaterThread-3 takes [Cake No.11byMakerThread-1 //
// MakerThread-3 puts [Cake No.12byMakerThread-3  //
// EaterThread-2 takes [Cake No.12byMakerThread-3 //
////////////////////////////////////////////////////
