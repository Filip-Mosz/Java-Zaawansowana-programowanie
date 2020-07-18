package org.example;

import org.example.util.TestDataProvider;
import org.junit.Test;
import org.model.Location;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class LocationMapperTest {

    @Test
    public void testMapping(){
        //given
        List<String> rawData = TestDataProvider.rawData;
        Map<Integer, String> voievodeshipsMap = TestDataProvider.mappedVoievodeships;
        //when
        List<Location> result = LocationMapper.mapLocations(rawData, voievodeshipsMap);

        //then
        assertEquals(4, result.size());


    }

}