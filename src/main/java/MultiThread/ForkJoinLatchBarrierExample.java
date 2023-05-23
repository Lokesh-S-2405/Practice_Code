package MultiThread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinLatchBarrierExample {

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        CountDownLatch latch = new CountDownLatch(1);
        CyclicBarrier barrier = new CyclicBarrier(4);
        ForkJoinPool pool = new ForkJoinPool();

        RecursiveTask<Integer> task = new SumTask(arr, 0, arr.length, latch, barrier);

        int sum = pool.invoke(task);

        System.out.println("Sum of array elements: " + sum);
    }
}

class SumTask extends RecursiveTask<Integer> {

    private int[] arr;
    private int start;
    private int end;
    private CountDownLatch latch;
    private CyclicBarrier barrier;

    public SumTask(int[] arr, int start, int end, CountDownLatch latch, CyclicBarrier barrier) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.latch = latch;
        this.barrier = barrier;
    }

    @Override
    protected Integer compute() {
        if (end - start <= 100) {
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += arr[i];
            }
            return sum;
        } else {
            int mid = (start + end) / 2;
            SumTask left = new SumTask(arr, start, mid, latch, barrier);
            SumTask right = new SumTask(arr, mid, end, latch, barrier);

            left.fork();
            right.fork();

            try {
                barrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }

            int sum = left.join() + right.join();
            latch.countDown();
            return sum;
        }
    }
}
