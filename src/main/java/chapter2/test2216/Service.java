package chapter2.test2216;

public class Service {
    public void serviceMethod(UserInfo userInfo){
        synchronized (userInfo){
            try {
                System.out.println(Thread.currentThread().getName());
                userInfo.setUsername("abcabcabc");
                Thread.sleep(3000);
                System.out.println("end time = "+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
