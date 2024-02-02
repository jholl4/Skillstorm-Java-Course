package com.skillstorm.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class AExecutorService {

    /*
     * An ExecutorService creates and manages Threads for you
     * 
     * types of threads:
     * - user-created threads - non-daemon threads normally ex: main method
     * - system threads - for example, garbage collection - daemon threads
     */

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isDaemon());

        // Use an ExecutorService
        // Uses the factory pattern so don't call the constructor, call the static
        // method on executors

        ExecutorService service = null;
        // .submit(Runnable): Future<E>
        // we can check the future's state
        // boolean isDone()
        // boolean isCanceled()
        //
        // V get() -- null since Runnable does not return anything
        try {
            service = Executors.newSingleThreadExecutor();
        } finally {
            // always shut down your service in a finally block
            if (service != null)
                service.shutdown();
        }
        example2();
        System.out.println("end main");
    }

    private static int counter;

    public static void example2() {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> future = service.submit(() -> {
                for (int i = 0; i < 1000; i++)
                    counter++;
                System.out.println("Counter: " + counter);
            });
            future.get(10000, TimeUnit.SECONDS);
            System.out.println("Done, counter = " + counter);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        } finally {
            // always shut down your service in a finally block
            if (service != null)
                service.shutdown();
        }
    }

}
