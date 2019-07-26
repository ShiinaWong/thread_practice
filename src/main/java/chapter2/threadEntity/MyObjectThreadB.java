package chapter2.threadEntity;

import chapter2.otherEntity.MyObject;
import chapter2.otherEntity.Service;

public class MyObjectThreadB extends Thread{
    private Service service;
    private MyObject object;
    public MyObjectThreadB(Service service, MyObject object){
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        object.speedPrintString();
    }
}
