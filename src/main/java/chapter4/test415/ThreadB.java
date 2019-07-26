package chapter4.test415;


public class ThreadB extends Thread {
    private MyService myService;
    public ThreadB(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.awaitB();
    }
}
