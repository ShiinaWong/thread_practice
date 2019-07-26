package chapter2.otherEntity;

public class MyObject {
    public void speedPrintString(){
        synchronized (this){

            System.out.println("speedPrintString _____getLock time="
                    +System.currentTimeMillis()+"run ThreadName="
                    +Thread.currentThread().getName());
            System.out.println("--------");
            System.out.println("speedPrintString _____releaseLock time="
                    +System.currentTimeMillis()+"run ThreadName="
                    +Thread.currentThread().getName());
        }
    }
}
