package chapter2.threadEntity;

import chapter2.otherEntity.HasSelfPrivateNum;

public class NumThread2 extends Thread {
    private HasSelfPrivateNum num;
    public NumThread2(HasSelfPrivateNum num){
        this.num = num;
    }

    @Override
    public void run() {
        num.addI("b");
    }
}
