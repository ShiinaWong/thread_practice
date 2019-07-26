package chapter2.threadEntity;

import chapter2.otherEntity.Service;

public class ServiceThread2 extends Thread {
    private Service service;
    public ServiceThread2(Service service){
        this.service = service;
    }

}
