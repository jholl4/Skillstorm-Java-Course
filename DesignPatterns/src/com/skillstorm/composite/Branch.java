package com.skillstorm.composite;

import java.util.ArrayList;
import java.util.List;

public class Branch implements Component {

    List<Component> subcomponents = new ArrayList<>();

    int num;

    public Branch() {
    }

    public Branch(int num) {
        this.num = num;
    }

    @Override
    public int doWork() {
        // do work and delegate work
        return num * num + subcomponents.stream().mapToInt(Component::doWork).sum();
    }

    @Override
    public String toString() {
        return "Branch [subcomponents=" + subcomponents + ", num=" + num + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((subcomponents == null) ? 0 : subcomponents.hashCode());
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
        Branch other = (Branch) obj;
        if (subcomponents == null) {
            if (other.subcomponents != null)
                return false;
        } else if (!subcomponents.equals(other.subcomponents))
            return false;
        if (num != other.num)
            return false;
        return true;
    }

}
