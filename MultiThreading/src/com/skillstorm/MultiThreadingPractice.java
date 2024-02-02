package com.skillstorm;

public class MultiThreadingPractice {

    /*
     * Multithreading
     * - the idea of splitting tasks into multiple threads that can run concurrently
     * with each other
     * - by default we have the single main thread that runs
     * 
     * 
     * trade-off: performance speed vs. power usage
     * - will use more resources while it's running, but will be done faster
     * 
     * THREAD STATES
     * 1. NEW - thread has been created but not yet started (new thread())
     * 2. RUNNABLE - thread has started (thread.start())
     * 3. BLOCKED - thread is waiting on some lock before continuing (waiting for a
     * resource to be available etc)
     * 4. WAITING - thread waiting indefinitely (thread.join() or thread.wait())
     * 5. TIMED-WAITING - thread is waiting for a specific amount of time
     * (thread.join(3000))
     * 6. TERMINATED - thread is finished
     * 
     */

    /*
     * Runnable Interface
     * - a functional interface for defining how a thread will run
     * - a functional interface is just an interface with only 1 method
     * 
     * - Runnable Interface vs Thread class
     * - Runnable interface allows you to extend any other class and implement
     * multiple interfaces
     * - Thread class limits you to only extending that one class
     */

    public static void main(String[] args) {
        RunnableTask task1 = new RunnableTask("task 1");
        RunnableTask task2 = new RunnableTask("task 2");
        RunnableTask task3 = new RunnableTask("task 3");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();
        thread2.start();
        thread3.start();
    }

}

class RunnableTask implements Runnable {

    private String taskName;

    public RunnableTask(String taskname) {
        this.taskName = taskname;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskName + " is running in the Thread " + Thread.currentThread().getName());
        System.out.println("Task " + taskName + " has finished!");
    }

}
