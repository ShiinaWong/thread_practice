package chapter2.test229;

public class Main {
    public static void main(String[] args) {
        Service service1 = new Service();
        Service service2 = new Service();
        ThreadA threadA = new ThreadA(service1);
        threadA.setName("AAA");
        threadA.start();
        ThreadB threadB = new ThreadB(service2);
        threadB.setName("BBB");
        threadB.start();
    }
}
