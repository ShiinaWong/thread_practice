package chapter2.test229;

public class ThreadC extends Thread {
    Service service;
    public ThreadC(Service service){
        this.service = service;
    }
    @Override
    public void run() {
        service.printC();
    }
}
