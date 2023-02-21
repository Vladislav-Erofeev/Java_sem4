package pr4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService threads = Executors.newFixedThreadPool(3);

        threads.submit(() -> {
            try {
                Thread.sleep(200);
            } catch (Exception e) {}
            System.out.println("First thread");
        });

        threads.submit(() -> {

            System.out.println("Second thread");
        });

        threads.submit(() -> {
            try {
                Thread.sleep(400);
            } catch (Exception e) {}
            System.out.println("Third thread");
        });

        threads.shutdown();
    }
}
