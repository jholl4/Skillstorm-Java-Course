package com.skillstorm.composite;

import java.util.Random;

public class Leaf implements Component {

    int num;

    public Leaf() {
    }

    public Leaf(int num) {
        this.num = num;
    }

    @Override
    public int doWork() {
        return num * num;
    }

    @Override
    public String toString() {
        return "Leaf [num=" + num + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + num;
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
        Leaf other = (Leaf) obj;
        if (num != other.num)
            return false;
        return true;
    }

}
