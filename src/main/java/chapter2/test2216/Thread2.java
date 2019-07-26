package chapter2.test2216;

public class Thread2 extends Thread{
    private MyService myService;

    public Thread2(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
