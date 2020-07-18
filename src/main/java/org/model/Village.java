package org.model;

public class Village extends Location{
    public Village(String name, String voivodeship) {
        super(name, voivodeship, LocationType.VILLAGE);
    }

    @Override
    public String sayGreeting() {
        return "Witamy we wsi " + getName();
    }
}
