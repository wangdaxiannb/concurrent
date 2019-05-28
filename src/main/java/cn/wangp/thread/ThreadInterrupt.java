package cn.wangp.thread;

public class ThreadInterrupt  extends Thread{

    @Override
    public void run() {

      //  System.out.println(Thread.currentThread().getName()+"开始");

        while(!Thread.currentThread().isInterrupted()){
            System.out.println(Thread.currentThread().getName()+"开始");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadInterrupt threadInterrupt = new ThreadInterrupt();
        threadInterrupt.start();
        Thread.sleep(2000L);

        threadInterrupt.interrupt();
    }

}
