package core.java.concurrency;

class MyTask implements Runnable {
    private String name;

    public MyTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // Simulate some work
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " is running: step " + i);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted.");
            }
        }
        System.out.println(name + " has finished.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create 3 tasks
        Thread t1 = new Thread(new MyTask("Thread-1"));
        Thread t2 = new Thread(new MyTask("Thread-2"));
        Thread t3 = new Thread(new MyTask("Thread-3"));

        // Start all threads concurrently
        t1.start();
        t2.start();
        t3.start();
    }
}

