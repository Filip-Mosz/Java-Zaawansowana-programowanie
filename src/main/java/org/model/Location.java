package org.model;
import lombok.Getter;

public abstract class Location {
    @Getter

    private String name;
    private String voivodeship;
    private LocationType type;

    public Location(String name, String voivodeship, LocationType type) {
        this.name = name;
        this.voivodeship = voivodeship;
        this.type = type;
    }

    public abstract String sayGreeting();
}
