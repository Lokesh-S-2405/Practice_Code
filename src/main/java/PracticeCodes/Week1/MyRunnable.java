package PracticeCodes.Week1;

import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable {
    private ReentrantLock lock;
    private int counter;

    public MyRunnable(ReentrantLock lock) {
        this.lock = lock;
        this.counter = 0;
    }

    public void run() {
        while (counter < 10) {
            lock.lock(); // Acquire the lock
            try {
                System.out.println(Thread.currentThread().getName() + " incrementing counter: " + counter);
                counter++;
            } finally {
                lock.unlock(); // Release the lock
            }
        }
    }
}
