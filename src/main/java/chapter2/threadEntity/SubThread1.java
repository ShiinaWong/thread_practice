package chapter2.threadEntity;

import chapter2.otherEntity.Sub;

public class SubThread1 extends Thread {
    private Sub sub;
    public SubThread1(Sub sub){
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
