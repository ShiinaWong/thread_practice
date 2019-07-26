package chapter2.test2211;

public class Service {
    synchronized public void methodA(){
        System.out.println("methodA start");
        boolean isContinueRun = true;
        while (isContinueRun){
        }
        System.out.println("methodA end");
    }
    synchronized public void methodB(){
        System.out.println("methodB start");
        System.out.println("methodB end");
    }
}
