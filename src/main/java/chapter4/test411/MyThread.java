package chapter4.test411;

public class MyThread extends Thread {
    private MyService myService;
    public MyThread(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
