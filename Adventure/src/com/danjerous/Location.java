package com.danjerous;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    /*public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = exits;


        this.exits.put("Q", 0);
    }*/

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<>(exits);
        this.exits.put("Q", 0);
    }

   /* public void addExist (String direction, int location) {
        exits.put(direction, location);
    }*/

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
