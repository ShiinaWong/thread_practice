package chapter2.threadEntity;

import chapter2.otherEntity.MyOneList;
import chapter2.otherEntity.MyService;

public class MyOneListThreadB extends Thread{
    private MyOneList myOneList;
    public MyOneListThreadB(MyOneList myOneList){
        this.myOneList = myOneList;
    }

    @Override
    public void run() {
        MyService ms = new MyService();
        ms.addServiceMethod(myOneList,"B");
    }
}
