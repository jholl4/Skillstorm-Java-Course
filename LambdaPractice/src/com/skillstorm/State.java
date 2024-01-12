package com.skillstorm;

import java.util.ArrayList;

public class State {

    private String name;
    private String capital;
    private ArrayList<City> cities;

    public State() {
    }

    public State(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public State(String name, String capital, ArrayList<City> cities) {
        this.name = name;
        this.capital = capital;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((capital == null) ? 0 : capital.hashCode());
        result = prime * result + ((cities == null) ? 0 : cities.hashCode());
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
        State other = (State) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (capital == null) {
            if (other.capital != null)
                return false;
        } else if (!capital.equals(other.capital))
            return false;
        if (cities == null) {
            if (other.cities != null)
                return false;
        } else if (!cities.equals(other.cities))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "State: " + name + ", capital: " + capital + ", cities: " + cities;
    }

}
