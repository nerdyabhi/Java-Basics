class ChildThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(500);  // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println("Child Thread interrupted!");
            }
        }
    }
}

public class Child {
    public static void main(String[] args) {
        ChildThread child = new ChildThread();  // Create a child thread
        child.start();  // Start the child thread

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(500);  // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println("Main Thread interrupted!");
            }
        }
    }
}
