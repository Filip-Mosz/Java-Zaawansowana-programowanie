package org.model;

public class UrbanRural extends Location{
    public UrbanRural(String name, String voivodeship) {
        super(name, voivodeship, LocationType.URBAN_RURAL);
    }

    @Override
    public String sayGreeting() {
        return "Witamy w Gminie miejsko-wiejskiej " + getName();
    }

    @Override
    public String toString() {
        return getName() + " województwo " + getVoivodeship();
    }
}
