package chapter2.test237;

public class Service {
    private boolean isContinueRun = true;
    private boolean isContinueRun1 = true;

    public void runMethod(){
        String any = new String();
        while (isContinueRun){
//            synchronized (any){
//
//            }
        }
        System.out.println("runMethod stoped");
    }
    public void stopRun(){
        isContinueRun = false;
        isContinueRun1 = false;
    }
    public void runMethod1(){
        System.out.println("runMethod1 start");
        String any = new String();
        while (isContinueRun1){
            synchronized (any){

            }
        }
        System.out.println("runMethod1 stoped");
    }
}
