package chapter2.test236;

import java.util.concurrent.atomic.AtomicLong;

public class MyService {
    public static AtomicLong count = new AtomicLong();
    synchronized public void addNum(){
        System.out.println(Thread.currentThread().getName()
                + "加了100后的值为" + count.addAndGet(100));
        count.addAndGet(1);
    }

}
