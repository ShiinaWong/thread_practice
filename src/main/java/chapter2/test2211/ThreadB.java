package chapter2.test2211;

public class ThreadB extends Thread{
    Service service ;
    public ThreadB(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
