package chapter3.test313;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.setName("a");
        a.setPriority(1);
        a.start();
        ThreadA a1 = new ThreadA(lock);
        a1.setName("a1");
        a1.start();
        ThreadA a2 = new ThreadA(lock);
        a2.setName("a2");
        a2.start();
        ThreadA a3 = new ThreadA(lock);
        a3.setName("a3");
        a3.start();
        ThreadA a4 = new ThreadA(lock);
        a4.setName("a4");
        a4.setPriority(10);
        a4.start();
        Thread.sleep(50);

        ThreadB b = new ThreadB(lock);
        b.start();
        Thread.sleep(7000);
        System.out.println("a status = "+a.getState().name());
        System.out.println("a1 status = "+a1.getState().name());
        System.out.println("a2 status = "+a2.getState().name());
        System.out.println("a3 status = "+a3.getState().name());
        System.out.println("a4 status = "+a4.getState().name());
    }
}
