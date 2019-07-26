package chapter2.threadEntity;

import chapter2.otherEntity.Service;

public class ServiceThread1 extends Thread {
    private Service service;
    public ServiceThread1 (Service service){
        this.service = service;
    }

}
