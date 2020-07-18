package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class VoivodshipMapper {

    static Predicate<String> voivedeshipFilter = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.contains("województwo");
        }
    };

public static Map<Integer, String> map(List<String> list){
    Map<Integer, String> result = new HashMap<>();

//WOJ;POW;GMI;RODZ;NAZWA;NAZWA_DOD;STAN_NA

    //List<String> voivedeshipLines =
            list.stream() //lista do streama(strumienia obiektów)
            .filter(line -> line.contains("województwo"))//filtrujemy to co przyszło
            .forEach(filteredLine -> {
                        String[] splitLine = filteredLine.split(";");
                        Integer number = Integer.valueOf(splitLine[0]);
                        String name = splitLine [4];

                        result.put(number, name);
                    }
            );//dzielimy to co przeszło przez filtr i dodajemy do mapy


    return result;
}

}
