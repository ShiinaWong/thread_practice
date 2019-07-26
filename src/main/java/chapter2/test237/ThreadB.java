package chapter2.test237;

public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        System.out.println("stop runMethod");
        service.stopRun();
    }
}
