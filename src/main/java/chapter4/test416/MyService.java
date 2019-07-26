package chapter4.test416;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition conditionA = lock.newCondition();
    public Condition conditionB = lock.newCondition();
    public void awaitA(){
        try {
            lock.lock();
            System.out.println("begin awaitA 时间为 :"+System.currentTimeMillis());
            conditionA.await();
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
            conditionB.await();
            System.out.println("end awaitB 时间为 :"+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void signalAll_A(){
        try {
            lock.lock();
            System.out.println("signal 时间为 :"+System.currentTimeMillis());
            conditionA.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public void signalAll_B(){
        try {
            lock.lock();
            System.out.println("signal 时间为 :"+System.currentTimeMillis());
            conditionB.signalAll();
        }finally {
            lock.unlock();
        }
    }
}
