package chapter3.test3111;
//消费者
public class C {
    private String lock;
    public C(String lock){
        this.lock = lock;
    }
    public void getValue(){
        try {
            synchronized (lock){
                while ("".equals(ValueObject.value)){
                    System.out.println("+++消费者"+
                            Thread.currentThread().getName()+"WAITING了+++");
                    lock.wait();
                }
                System.out.println("+++消费者"+
                        Thread.currentThread().getName()+"RUNNABLE了+++");
                ValueObject.value = "";
                lock.notifyAll();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
