package example3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AppTwo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        });
// => Hello pool-1-thread-1
        try {
            System.out.println("attemp to shutdown");
            executor.shutdown();
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.printf("task interrupted");
        } finally {
            if (!executor.isTerminated()) {
                System.out.println("we'r going to cancel non-finished tasks");
            }

            executor.shutdown();
            System.out.println("shutdown finished");
        }
    }
}
