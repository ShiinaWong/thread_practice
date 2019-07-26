package chapter2.threadEntity;

import chapter2.otherEntity.ServiceEntity;

public class ServiceThreadB extends Thread {
    private ServiceEntity serviceEntity;
    public ServiceThreadB(ServiceEntity serviceEntity){
        this.serviceEntity = serviceEntity;
    }

    @Override
    public void run() {
        serviceEntity.b();
    }
}
