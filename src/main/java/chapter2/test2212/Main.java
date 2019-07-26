package chapter2.test2212;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DealThread dealThread1 = new DealThread();
        dealThread1.setFlag("a");
        Thread t1 = new Thread(dealThread1);
        t1.start();
        Thread.sleep(100);
        dealThread1.setFlag("b");
        Thread t2 = new Thread(dealThread1);
        t2.start();
    }
}
