package cn.wangp.deadLock;

public class DeadLockDemo {


    private static final  Object A = new Object();
    private static final  Object B = new Object();

    public static void main(String[] args) {

        new Thread(()->{
            synchronized (A){
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(B){
                    System.out.println("A---------B");
                }
            }
        }).start();

        new Thread(()->{
            synchronized (B){
                synchronized(A){
                    System.out.println("A---------B");
                }
            }
        }).start();
    }
}
