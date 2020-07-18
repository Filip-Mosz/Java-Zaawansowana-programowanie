package org.model;

public class City extends Location{
    public City(String name, String voivodeship) {
        super(name, voivodeship, LocationType.CITY);
    }

    @Override
    public String sayGreeting() {
        return "Welcome in " + super.getName() + " city!";
    }
}
