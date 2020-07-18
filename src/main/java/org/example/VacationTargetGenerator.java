package org.example;

import org.model.Location;
import org.model.LocationType;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class VacationTargetGenerator {

    public static Location getRandomLocation(List<Location> locations){
        int randomNumber = new Random().nextInt(locations.size());
        return locations.get(randomNumber);
    }

    public static Location getRandomLocation(List<Location> locations, LocationType type){
        List<Location> filteredLocations =
        locations.stream()
                .filter(loc -> loc.getType() == type)
                .collect(Collectors.toList());
        return getRandomLocation(filteredLocations);
    }

}
