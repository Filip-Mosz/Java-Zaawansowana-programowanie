package org.example;

import org.model.Location;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Ma zwracać miejscowości z najdłuższą nazwą

public class LocationAnalyzer {
    public static List<Location> hasLongestName(List<Location> list){
//rozwiązanie P MArcińca; rozwiązanie Damiana coś nie współpracuje
    List<Location> locationsWithLongestName = new ArrayList<>();
    int longestLocationSize = 1;
    for (Location location : list) {
        if (location.getName().length() > longestLocationSize) {
            longestLocationSize = location.getName().length();
        }
    }
    for (Location location : list) {
        if (location.getName().length() == longestLocationSize) {
            locationsWithLongestName.add(location);
        }
    }
    return locationsWithLongestName;
    }

    public static Map<String, List<Location>> getLongestNameInVoievodeships (List<Location> locations){
        Map<String, List<Location>> longestNamesByVoievodeships = new HashMap<>();
        locations.stream()
                .collect(Collectors.groupingBy(location -> location.getVoivodeship()))
                .forEach((key, value) -> {
                    longestNamesByVoievodeships.put(key,hasLongestName(value))                    ;
                });
        return longestNamesByVoievodeships;
    }
}

//rozwiązanie P. Marcińca:
//public static List<Location> getLocationsWithLongestName(List<Location> locations) {
//    List<Location> locationsWithLongestName = new ArrayList<>();
//    int longestLocationSize = 1;
//    for (Location location : locations) {
//        if (location.getName().length() > longestLocationSize) {
//            longestLocationSize = location.getName().length();
//        }
//    }
//    for (Location location : locations) {
//        if (location.getName().length() == longestLocationSize) {
//            locationsWithLongestName.add(location);
//        }
//    }
//    return locationsWithLongestName
//}

//Rozwiązanie Damiana N
// public static List<Location> getLongestNamesLocations(List<Location> locationList) {
//        return locationList.stream()
//                .collect(Collectors.groupingBy(location -> location.getName().length()))
//                .entrySet()
//                .stream()
//                .max(Map.Entry.comparingByKey())
//                .map(Map.Entry::getValue)
//                .orElseThrow();
//    }
