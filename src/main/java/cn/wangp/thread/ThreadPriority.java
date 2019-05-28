package cn.wangp.thread;

/**
 * 线程优先级
 */
public class ThreadPriority  {

    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            while (true) {
                System.out.println(Thread.currentThread().getName());
            }
        });
        Thread thread2 = new Thread(()->{
            while(true) {
                System.out.println(Thread.currentThread().getName());
            }
        });

        thread.setPriority(Thread.MIN_PRIORITY); //1
        thread.setPriority(Thread.NORM_PRIORITY); //5
        thread2.setPriority(Thread.MAX_PRIORITY); //10

        thread.start();
        thread2.start();
    }

}
