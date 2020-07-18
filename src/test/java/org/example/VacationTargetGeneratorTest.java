package org.example;

import org.junit.Test;
import org.model.City;
import org.model.Location;
import org.model.UrbanRural;
import org.model.Village;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class VacationTargetGeneratorTest {

    @Test
    public void shouldreturnSomething(){
        //given
        List<Location> locs = List.of(new Village("Hobbiton", "Shire"),
                new Village("Moja Zaorana", "Testowe"),
                new UrbanRural("Edoras", "Meduseld"),
                new City("Minas Tirith", "Pelennor"));

        //when
        Location randomLocation = VacationTargetGenerator.getRandomLocation(locs);

        //then
        assertNotNull(randomLocation);
    }

}