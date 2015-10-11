package org.hfeng.jmdp.ch03.l01;

public class Main {
    public static void main(String[] args) {
        RequestQueue requestQueue = new RequestQueue();
        new ClientThread(requestQueue, "Alice", 3141592L).start();
        new ServerThread(requestQueue, "Bobby", 6535897L).start();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Alice requests [ Request No.0 ]                //
// Bobby handles [ Request No.0 ]                 //
// Alice requests [ Request No.1 ]                //
// Alice requests [ Request No.2 ]                //
// Bobby handles [ Request No.1 ]                 //
// Bobby handles [ Request No.2 ]                 //
// ...                                            //
////////////////////////////////////////////////////
