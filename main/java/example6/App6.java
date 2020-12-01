package example6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App6 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> stringFuture = executorService.submit(new CallableTask());
        System.out.println("future done?"+stringFuture.isDone());
        try {
            executorService.shutdown();
            String s = stringFuture.get();
            System.out.println("future done?" + stringFuture.isDone());
            System.out.println("result:d "+s);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
