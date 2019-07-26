package chapter4.test411;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    public void testMethod(){
        lock.lock();
        for(int i=0;i<5;i++){
            System.out.println("ThreaadName = "+ Thread.currentThread().getName()+" "+(i+1));
        }
        lock.unlock();
    }
}
