package chapter2.test236;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        MyThread[] myThreadArray = new MyThread[5];
        for(int i=0;i<myThreadArray.length;i++){
            myThreadArray[i] = new MyThread(service);
        }
        for(int i=0;i<myThreadArray.length;i++){
            myThreadArray[i].start();
        }
        Thread.sleep(1000);
        System.out.println(service.count.get());
    }
}
