package chapter4.test415;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();
    public void awaitA(){
        try {
            lock.lock();
            System.out.println("begin awaitA 时间为 :"+System.currentTimeMillis());
            condition.await();
            System.out.println("end awaitA 时间为 :"+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void awaitB(){
        try {
            lock.lock();
            System.out.println("begin awaitB 时间为 :"+System.currentTimeMillis());
            condition.await();
            System.out.println("end awaitB 时间为 :"+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void signalAll(){
        try {
            lock.lock();
            System.out.println("signal 时间为 :"+System.currentTimeMillis());
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }
}
