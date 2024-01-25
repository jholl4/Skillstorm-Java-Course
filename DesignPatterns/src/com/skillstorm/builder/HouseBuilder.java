package com.skillstorm.builder;

import java.util.List;

public class HouseBuilder {

    private String roof;
    private List<String> walls;
    private String doors;
    private String floors;
    private String windows;

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

    public House build(String roof, List<String> walls, String doors, String floors, String windows) {
        return new House(roof, walls, doors, floors);
    }

}
