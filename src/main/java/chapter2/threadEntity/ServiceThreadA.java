package chapter2.threadEntity;

import chapter2.otherEntity.ServiceEntity;

public class ServiceThreadA extends Thread {
    private ServiceEntity serviceEntity;
    public ServiceThreadA(ServiceEntity serviceEntity){
        this.serviceEntity = serviceEntity;
    }

    @Override
    public void run() {
        serviceEntity.a();
    }
}
