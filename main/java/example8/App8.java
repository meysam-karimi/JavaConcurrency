package example8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class App8 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executerService = Executors.newWorkStealingPool();
        List<Callable<String>> callables = Arrays.asList(() -> "task1", () -> "task2");

        executerService.invokeAll(callables)
                .stream()
                .map(stringFuture -> {
                    try {

                        return stringFuture.get();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                    return null;
                }).forEach(System.out::println);


    }
}
