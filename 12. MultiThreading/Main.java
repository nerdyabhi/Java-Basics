class A extends  Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("A being Executed.");
        }
    }
}

// Hello world , i Am Abhi Sharma
class B extends Thread{
   public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("B being .");
        }
    }
}

// Thread.Sleep , 
//Thread.getPriority , Thread.setPriority is also there.


public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start(); // It'll point to run() of the object and start executing from there.
        obj2.start();
    }
}
