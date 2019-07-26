package chapter3.test3111.test04;

public class C {
    private MyStack myStack;
    public C(MyStack myStack){
        this.myStack = myStack;
    }
    public void popService(){
        System.out.println("pop = " + myStack.pop());
    }
}
