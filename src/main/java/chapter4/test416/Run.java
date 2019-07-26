package chapter4.test416;


public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        ThreadB threadB = new ThreadB(myService);
        threadA.setName("AAA");
        threadA.start();
        threadB.setName("BBB");
        threadB.start();
        Thread.sleep(3000);
        myService.signalAll_A();
    }
}
