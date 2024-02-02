package com.skillstorm.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class BCallable {

    /*
     * Callable is an interface like Runnable
     * execpt its method is
     * E run() throws Exception
     * 
     * Overcomes limitations of runnable (no return value, can't throw exceptions)
     * 
     */

    // step 1: Create an instance of executor service
    // step 2:
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<Integer> result = service.submit(() -> {
                int counter = 1;
                for (int i = 0; i < 10; i++) {
                    counter++;
                }
                return counter;
            });
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }

}
