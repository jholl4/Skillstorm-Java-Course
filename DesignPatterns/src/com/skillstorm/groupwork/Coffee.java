package com.skillstorm.groupwork;

public final class Coffee {

    private final String coffeeType;
    private final String roastType;

    public Coffee(String coffeeType, String roastType) {
        this.coffeeType = coffeeType;
        this.roastType = roastType;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public String getRoastType() {
        return roastType;
    }

    @Override
    public String toString() {
        return "Coffee [coffeeType=" + coffeeType + ", roastType=" + roastType + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((coffeeType == null) ? 0 : coffeeType.hashCode());
        result = prime * result + ((roastType == null) ? 0 : roastType.hashCode());
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
        Coffee other = (Coffee) obj;
        if (coffeeType == null) {
            if (other.coffeeType != null)
                return false;
        } else if (!coffeeType.equals(other.coffeeType))
            return false;
        if (roastType == null) {
            if (other.roastType != null)
                return false;
        } else if (!roastType.equals(other.roastType))
            return false;
        return true;
    }

}
