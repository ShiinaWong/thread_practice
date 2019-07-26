package chapter2.test237;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        Thread.sleep(1000);
        ThreadB threadB = new ThreadB(service);
        threadB.start();
    }
}
