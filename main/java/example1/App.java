package example1;

public class App {
    public static void main(String[] args) {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        };

        Runnable mySeconfTask = () -> {
            System.out.println("hello second thread");
        };

        task.run();

        Thread thread = new Thread(task, "Meysam's Thread");
        thread.start();

        System.out.println("Done!");
    }
}
