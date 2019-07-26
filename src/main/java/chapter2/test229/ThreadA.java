package chapter2.test229;

public class ThreadA extends Thread {

    Service service;
    public ThreadA(Service service){
        this.service = service;
    }
    @Override
    public void run() {
        service.printA();
    }
}
