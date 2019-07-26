package chapter3.test3110;

import chapter3.test313.ThreadA;

public class Subtract {
    private String lock;
    public Subtract(String lock){
        this.lock = lock;
    }

    public void subtract() {
        synchronized (lock) {
            try {
                while (ValueObject.list.size() == 0){
                    System.out.println("wait begin ThreadName="
                            + Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wait end ThreadName="
                            + Thread.currentThread().getName());
                }
                ValueObject.list.remove(0);
                System.out.println("list's size = " + ValueObject.list.size());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//            try {
//                if (ValueObject.list.size() == 0) {
//                    System.out.println("wait begin ThreadName = " + Thread.currentThread().getName());
//                    lock.wait();
//                    System.out.println("wait end ThreadName = " + Thread.currentThread().getName());
//                }
//                ValueObject.list.remove(0);
//                System.out.println("list's size = " + ValueObject.list.size());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
