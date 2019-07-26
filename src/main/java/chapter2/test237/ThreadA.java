package chapter2.test237;

public class ThreadA extends Thread {
    private Service service;
    public ThreadA (Service service){
        this.service = service;
    }

    @Override
    public void run() {
        service.runMethod1();
        service.runMethod();
    }
}
