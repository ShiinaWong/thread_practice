package chapter4.test411;

public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThread thread1 = new MyThread(myService);
        MyThread thread2 = new MyThread(myService);
        MyThread thread3 = new MyThread(myService);
        MyThread thread4 = new MyThread(myService);
        MyThread thread5 = new MyThread(myService);
        MyThread thread6 = new MyThread(myService);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
    }
}
