package com.skillstorm.composite;

public class Tree implements Component {

    int num;

    public Tree() {
    }

    public Tree(int num) {
        this.num = num;
    }

    @Override
    public int doWork() {
        return num * num;
    }

    @Override
    public String toString() {
        return "Tree [num=" + num + "]";
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
        Tree other = (Tree) obj;
        if (num != other.num)
            return false;
        return true;
    }

}
