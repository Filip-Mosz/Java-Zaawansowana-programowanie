package org.example;

import org.model.City;
import org.model.Location;
import org.model.UrbanRural;
import org.model.Village;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LocationMapper {


    public static List<Location> mapLocations(List<String> rawLines, Map<Integer, String> voivodeships) {
        return rawLines.stream()
                .filter(line -> line.contains("gmina"))
                .map(filteredLine -> {
                    String[] splitLine = filteredLine.split(";");
                    String type = splitLine[5];
                    String name = splitLine[4];
                    Integer voiNumber = Integer.valueOf(splitLine[0]);
                    String voievodeshipName = voivodeships.get(voiNumber);

                    switch (type) {
                        case "gmina wiejska": {
                            return new Village(name, voievodeshipName);
                        }

                        case "gmina miejska": {
                            return new City(name, voievodeshipName);
                        }

                        case "gmina miejsko-wiejska": {
                            return new UrbanRural(name, voievodeshipName);
                        }

                        default:
                            throw new IllegalArgumentException();
                    }
                })
                .collect(Collectors.toList());
    }
}
