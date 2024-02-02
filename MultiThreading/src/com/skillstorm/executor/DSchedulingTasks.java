package com.skillstorm.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DSchedulingTasks {

    private static int unreadEmails = 10;

    public static void main(String[] args) {
        checkEmailScheduled();
    }

    /*
     * ScheduledExecutorService
     * - schedule to happen once in the future or repeatedly at given intervals
     * 
     * Methods:
     * - schedule(runnable, delay, timeunit)
     * - schedule(callable, delay, timeunit)
     * - scheduleAtFixedRate(runnable, initialdelay, delay, timeunit)
     * - scheduleAtFixedDelay(runnable, initialdelay, delay, timeunit)
     * 
     * Example: run every hour - fixed rate
     * 2pm
     * 3pm
     * 4pm
     * 5pm
     * 
     * Step 1: create Executor
     * Step 2: schedule some tasks
     * step 3: shutdown the executor - we can 
     * 
     * main instead of .get on one task, can wait for all tasks using method:
     * Service.awaitTermination(30, TimeUnit.SECONDS)
     *      
     * */

     public static void checkEmailScheduled(){
        Runnable task = ()->System.out.println("Checking email");
        ScheduledExecutorService scheduledService = null;
     try{
        scheduledService = Executors.newScheduledThreadPool(10);

        Future<?> emailCheck = scheduledService.scheduleAtFixedRate(task, 5, 5, TimeUnit.SECONDS);
    }finally{
        if(scheduledService==null)
        scheduledService.shutdown();
    }
    try{
        scheduledService.awaitTermination(unreadEmails, null);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }finally{

    }
     }
     

}
