package example5;


import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class App5 {
    public static void main(String[] args) {
        Callable<Integer> task = () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                return 1234;
            } catch (InterruptedException e) {
                throw new IllegalStateException("Task interrupted", e);
            }
        };
    }
}
