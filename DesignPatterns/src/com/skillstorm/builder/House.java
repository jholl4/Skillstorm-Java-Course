package com.skillstorm.builder;

import java.util.List;

public class House {

    private String roof;
    private List<String> walls;
    private String doors;
    private String floors;
    private String windows;

    public House(String roof, List<String> walls, String doors, String floors) {
        this.roof = roof;
        this.walls = walls;
        this.doors = doors;
        this.floors = floors;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setWalls(List<String> walls) {
        this.walls = walls;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public void setFloors(String floors) {
        this.floors = floors;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getRoof() {
        return roof;
    }

    public List<String> getWalls() {
        return walls;
    }

    public String getDoors() {
        return doors;
    }

    public String getFloors() {
        return floors;
    }

    public String getWindows() {
        return windows;
    }

    @Override
    public String toString() {
        return "House [roof=" + roof + ", walls=" + walls + ", doors=" + doors + ", floors=" + floors + ", windows="
                + windows + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((roof == null) ? 0 : roof.hashCode());
        result = prime * result + ((walls == null) ? 0 : walls.hashCode());
        result = prime * result + ((doors == null) ? 0 : doors.hashCode());
        result = prime * result + ((floors == null) ? 0 : floors.hashCode());
        result = prime * result + ((windows == null) ? 0 : windows.hashCode());
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
        House other = (House) obj;
        if (roof == null) {
            if (other.roof != null)
                return false;
        } else if (!roof.equals(other.roof))
            return false;
        if (walls == null) {
            if (other.walls != null)
                return false;
        } else if (!walls.equals(other.walls))
            return false;
        if (doors == null) {
            if (other.doors != null)
                return false;
        } else if (!doors.equals(other.doors))
            return false;
        if (floors == null) {
            if (other.floors != null)
                return false;
        } else if (!floors.equals(other.floors))
            return false;
        if (windows == null) {
            if (other.windows != null)
                return false;
        } else if (!windows.equals(other.windows))
            return false;
        return true;
    }

}
