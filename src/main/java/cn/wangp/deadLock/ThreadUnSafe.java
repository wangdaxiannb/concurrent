package cn.wangp.deadLock;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadUnSafe {
 // private static AtomicInteger sum = new AtomicInteger(0);
  private static int sum = 0;

    public static synchronized void increat(){
        //sum.incrementAndGet();
       sum++;
    }

    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            new Thread(() -> {
                for (int j = 0; j <100 ; j++) {
                    increat();
                }
            }).start();
            System.out.println(sum);
        }

    }

}
