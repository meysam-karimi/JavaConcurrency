package example3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppTwo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        });
// => Hello pool-1-thread-1
        executor.shutdown();
    }
}
