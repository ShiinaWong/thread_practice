package chapter2;

import chapter2.otherEntity.MyObject;
import chapter2.otherEntity.Service;
import chapter2.threadEntity.*;

public class MainMethod {
    public static void main(String[] args) throws InterruptedException {
        MyObject object = new MyObject();
        Service service = new Service();
        MyObjectThreadA threadA = new MyObjectThreadA(service,object);
        threadA.setName("AAA");
        threadA.start();
        MyObjectThreadB threadB = new MyObjectThreadB(service,object);
        threadB.setName("BBB");
        threadB.start();
    }

}
