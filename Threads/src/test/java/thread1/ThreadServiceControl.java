package thread1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadServiceControl {
    public static void main(String[] args) {
        // Create an ExecutorService with a fixed thread pool of size 3
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Run 10 iterations with only 3 threads available
        for (int i = 0; i < 10; i++) {
            final int taskId = i + 1;
            executorService.submit(() -> {
                // Simulate task execution
                System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
                try {
                    // Simulate some work with sleep (e.g., 1 second)
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        // Shut down the executor after all tasks are submitted
        executorService.shutdown();

        try {
            // Wait until all tasks have finished execution
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                executorService.shutdownNow(); // Force shutdown if tasks don't finish in time
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }

        System.out.println("All tasks completed.");
    }
}
