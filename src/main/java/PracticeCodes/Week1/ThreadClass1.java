package PracticeCodes.Week1;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadClass1 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        // Create two threads and pass the same lock object to them
        Thread thread1 = new Thread(new MyRunnable(lock), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(lock), "Thread 2");

        // Start the threads
        thread1.start();
        thread2.start();
    }
}

