package chapter2.otherEntity;

public class ServiceEntity {
    String anyString = new String();
    public void a(){
        synchronized (anyString){
            try {
                System.out.println("a begin");
                Thread.sleep(3000);
                System.out.println("a end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized public void b(){
        System.out.println("b begin");
        System.out.println("b end");
    }
}
