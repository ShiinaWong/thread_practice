package chapter2.test2214;

public class OutClass {
    static class InnerClass1{
        public void method1(InnerClass2 innerClass2){
            String threadName = Thread.currentThread().getName();
            synchronized (innerClass2){
                System.out.println(threadName+"进入InnerClass1类中的method1 方法");
                for(int k=0;k<10;k++){
                    System.out.println("i="+k);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(threadName+"离开InnerClass1类中的method1 方法");
            }
        }
        public synchronized void method2(){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+"进入InnerClass1类中的method2 方法");
            for(int k=0;k<10;k++){
                System.out.println("j="+k);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName+"离开InnerClass1类中的method2 方法");
        }
    }

    static class InnerClass2{
        public synchronized void method1(){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+"进入InnerClass2类中的method1 方法");
            for(int k=0;k<10;k++){
                System.out.println("k="+k);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName+"离开InnerClass2类中的method1 方法");
        }
    }
}
