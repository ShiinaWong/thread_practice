package chapter3.test3111;
//生产者
public class P {
    private String lock;
    public P(String lock){
        this.lock = lock;
    }
    public void setValue(){
        try{
            synchronized (lock){
                while (!"".equals(ValueObject.value)){
                    System.out.println("---生产者"+
                            Thread.currentThread().getName()+"WAITNG---");
                    lock.wait();
                }
                System.out.println("---生产者"+
                        Thread.currentThread().getName()+"RUNNABLE了---");
                String value = System.currentTimeMillis() + "_"+ System.nanoTime();
                ValueObject.value = value;
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
