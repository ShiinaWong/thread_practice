package chapter2.otherEntity;

public class Service {
     public void testMethod(MyObject object){
         synchronized (object){
             try {
                 System.out.println("testMethod _____getLock time="
                         +System.currentTimeMillis()+"run ThreadName="
                         +Thread.currentThread().getName());
                 Thread.sleep(5000);
                 System.out.println("testMethod _____releaseLock time="
                         +System.currentTimeMillis()+"run ThreadName="
                         +Thread.currentThread().getName());
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }

     }
}
