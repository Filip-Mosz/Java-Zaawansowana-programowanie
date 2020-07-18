package org.example.util;

import java.util.List;
import java.util.Map;

public class TestDataProvider {

    public static final List<String> rawData = List.of(
            "02;01;;;bolesławiecki;powiat;2020-01-01",
            "02;01;01;1;Bolesławiec;gmina miejska;2020-01-01",
            "02;01;02;2;Bolesławiec;gmina wiejska;2020-01-01",
            "02;01;03;2;Gromadka;gmina wiejska;2020-01-01",
            "02;01;04;3;Nowogrodziec;gmina miejsko-wiejska;2020-01-01",
            "02;01;04;4;Nowogrodziec;miasto;2020-01-01",
            "02;01;04;5;Nowogrodziec;obszar wiejski;2020-01-01",
            "02;01;05;2;Osiecznica;gmina wiejska;2020-01-01",
            "02;01;06;2;Warta Bolesławiecka;gmina wiejska;2020-01-01",
            "02;01;06;2;Warta Bolesławiecka;gmina wiejska;2020-01-01",
            "02;02;;;dzierżoniowski;powiat;2020-01-01",
            "02;;;;DOLNOŚLĄSKIE;województwo;2020-01-01",
            "63;02;07;3;Niemcza;gmina miejsko-wiejska;2020-01-01",
            "63;;;;PRUSY KRÓLEWSKIE;województwo;2020-01-01");

    public static final Map<Integer, String> mappedVoievodeships = Map.of(2,"DOLNOŚLĄSKIE",
            63, "PRUSY KRÓLEWSKIE");
}
