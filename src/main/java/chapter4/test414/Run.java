package chapter4.test414;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        ThreadB threadB = new ThreadB(myService);
        threadA.start();
        Thread.sleep(3000);
        myService.signal();
    }
}
