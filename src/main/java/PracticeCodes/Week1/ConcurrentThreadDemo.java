package PracticeCodes.Week1;
import java.util.concurrent.ExecutorService;
        import java.util.concurrent.Executors;

public class ConcurrentThreadDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            executor.execute(new MyRunnable1(i));
        }

        executor.shutdown();
    }
}

