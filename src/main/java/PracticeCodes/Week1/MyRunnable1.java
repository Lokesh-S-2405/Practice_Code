package PracticeCodes.Week1;

public class MyRunnable1 implements Runnable {
    private int taskId;

    public MyRunnable1(int taskId) {
        this.taskId = taskId;
    }

    public void run() {
        System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
    }
}
