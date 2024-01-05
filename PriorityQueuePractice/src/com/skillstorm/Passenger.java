package com.skillstorm;

public class Passenger {

    public String name;
    public int group;

    public Passenger(String name, int group) {
        this.name = name;
        this.group = group;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + group;
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
        Passenger other = (Passenger) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (group != other.group)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Passenger name=" + name + ", group=" + group;
    }

}
