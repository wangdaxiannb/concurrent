package cn.wangp.thread;

import java.io.IOException;

public class ThreadStatus {


    public static void main(String[] args) throws IOException, InterruptedException {
       /* Thread thread = new Thread();
        System.in.read();
        */
    /*    new Thread(()->{

            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();*/
        Object o = new Object();

        new Thread(()->{

            synchronized(o){
                try {
                    Thread.sleep(20000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        Thread.sleep(1000L);
        new Thread(()->{

            synchronized(o){
                try {
                    Thread.sleep(20000L);
                } catch (InterruptedException e) {


                }
            }
        }).start();
    }
}
