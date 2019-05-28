package cn.wangp.thread;

public class ThreadGuaQi implements Runnable {

    private static Object object  = new Object();
    @Override
    public void run() {

        synchronized(object){

            System.out.println(Thread.currentThread().getName()+"开始挂起...");

            try {
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"开始恢复");

        }

    }

    public static void main(String[] args) throws InterruptedException {
        ThreadGuaQi threadGuaQi = new ThreadGuaQi();
        Thread thread = new Thread(threadGuaQi);
        thread.setName("线程11111");
        thread.start();

        ThreadGuaQi threadGuaQi2 = new ThreadGuaQi();
        Thread thread2 = new Thread(threadGuaQi2);
        thread2.setName("线程2222");
        thread2.start();
        Thread.sleep(2000L);

        synchronized(object) {
            object.notifyAll();
        }
    }
}
