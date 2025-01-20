
class myThread extends Thread {

    public myThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " with priority " + getPriority());
    }
}

class q22Thread {

    public static void main(String[] args) {
        myThread t1 = new myThread("t1");
        myThread t2 = new myThread("t2");
        myThread t3 = new myThread("t3");

        t1.setPriority(1);
        t2.setPriority(1);
        t3.setPriority(10);

        t1.start();
        t2.start();
        t3.start();

        for (int i = 0; i < 10; i++) {
            t1.run();
            t2.run();
            t3.run();
        }
    }
}
