package package9;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class App8 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executer =
                Executors.newScheduledThreadPool(1);
        Runnable task = () -> System.out.println("Scheduling: "+System.nanoTime());
        ScheduledFuture<?> future = executer.schedule(task, 3, TimeUnit.SECONDS);
        TimeUnit.MICROSECONDS.sleep(1337);

        long remainingDelay = future.getDelay(TimeUnit.MILLISECONDS);
        System.out.printf("Remaining Delay: %sms", remainingDelay);

    }
}
