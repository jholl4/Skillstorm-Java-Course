package com.skillstorm;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DoingLaundry {

    // ReentrantLock - allows thread to reenter into a lock on a resource
    // you will have to wait for the washingmachine to be finished before you can
    // put in another load
    public static Lock washerLock = new ReentrantLock();
    public static Lock dryerLock = new ReentrantLock();
    public static Lock folderLock = new ReentrantLock();

    public static void main(String[] args) {
        List<Laundry> laundryToDo = new ArrayList<>();
        laundryToDo.add(new Laundry("whites", "dirty"));
        laundryToDo.add(new Laundry("delicates", "dirty"));
        laundryToDo.add(new Laundry("bedding", "dirty"));

        Thread washer;
        Thread dryer;
        Thread folder;

        for (Laundry laundry : laundryToDo) {
            washer = new Thread(new WashingMachine(laundry));
            dryer = new Thread(new DryerMachine(laundry));
            folder = new Thread(new FoldingRobot(laundry));
            washer.start();
            dryer.start();
            folder.start();

        }

    }

}

class Laundry {

    String type;
    String status; // dirty, washed, folded, dried

    public Laundry() {
    }

    public Laundry(String type, String status) {
        this.type = type;
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Laundry [type=" + type + ", status=" + status + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laundry other = (Laundry) obj;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        return true;
    }

}

class WashingMachine implements Runnable {

    Laundry currentLoad;

    public WashingMachine(Laundry currentLoad) {
        this.currentLoad = currentLoad;
    }

    @Override
    public void run() {
        // loop until currentload set to dirty
        while (!currentLoad.getStatus().equals("dirty")) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        DoingLaundry.washerLock.lock();

        System.out.println("The washing machine has started on " + currentLoad.getType());

        try {
            // simulating the washer
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The washing machine has finished washing " + currentLoad.getType());
        currentLoad.setStatus("washed");
        DoingLaundry.washerLock.unlock();
    }

}

class DryerMachine implements Runnable {

    Laundry currentLoad;

    public DryerMachine(Laundry currentLoad) {
        this.currentLoad = currentLoad;
    }

    @Override
    public void run() {
        // loop until currentload set to washed
        while (!currentLoad.getStatus().equals("washed")) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        DoingLaundry.dryerLock.lock();

        System.out.println("The dryer machine has started on " + currentLoad.getType());

        try {
            // simulating the dryer
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The dryer machine has finished drying " + currentLoad.getType());
        currentLoad.setStatus("dried");
        DoingLaundry.dryerLock.unlock();
    }

}

class FoldingRobot implements Runnable {

    Laundry currentLoad;

    public FoldingRobot(Laundry currentLoad) {
        this.currentLoad = currentLoad;
    }

    @Override
    public void run() {
        // loop until currentload set to dried
        while (!currentLoad.getStatus().equals("dried")) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        DoingLaundry.folderLock.lock();

        System.out.println("The folding robot has started folding " + currentLoad.getType());

        try {
            // simulating the folding
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The folding robot has finished folding " + currentLoad.getType());
        currentLoad.setStatus("folded");
        DoingLaundry.folderLock.unlock();
    }

}
