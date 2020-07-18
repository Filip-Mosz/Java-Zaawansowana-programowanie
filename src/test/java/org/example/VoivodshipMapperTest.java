package org.example;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class VoivodshipMapperTest {

    @Test
    public void testMapping() {
        //given
        List<String> rawData = List.of(
                "02;01;;;bolesławiecki;powiat;2020-01-01",
                "02;01;01;1;Bolesławiec;gmina miejska;2020-01-01"
         /*       "02;01;02;2;Bolesławiec;gmina wiejska;2020-01-01",
                "02;01;03;2;Gromadka;gmina wiejska;2020-01-01",
                "02;01;04;3;Nowogrodziec;gmina miejsko-wiejska;2020-01-01",
                "02;01;04;4;Nowogrodziec;miasto;2020-01-01",
                "02;01;04;5;Nowogrodziec;obszar wiejski;2020-01-01",
                "02;01;05;2;Osiecznica;gmina wiejska;2020-01-01",
                "02;01;06;2;Warta Bolesławiecka;gmina wiejska;2020-01-01",
                "02;01;06;2;Warta Bolesławiecka;gmina wiejska;2020-01-01",
                "02;02;;;dzierżoniowski;powiat;2020-01-01",
                "02;;;;DOLNOŚLĄSKIE;województwo;2020-01-01",
                "63;;;;PRUSY KRÓLEWSKIE;województwo;2020-01-01"*/);

        //when
        Map<Integer, String> results = VoivodshipMapper.map(rawData);

        //then
        assertEquals(2, results.size());
        assertTrue(results.values().contains("PRUSY KRÓLEWSKIE"));
    }

}