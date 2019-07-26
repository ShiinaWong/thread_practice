package chapter2.threadEntity;

import chapter2.otherEntity.HasSelfPrivateNum;

public class NumThread1 extends Thread {
    private HasSelfPrivateNum num;
    public NumThread1 (HasSelfPrivateNum num){
        this.num = num;
    }

    @Override
    public void run() {
        num.addI("a");
    }
}
