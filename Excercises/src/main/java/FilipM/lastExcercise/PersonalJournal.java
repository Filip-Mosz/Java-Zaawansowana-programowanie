package FilipM.lastExcercise;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

//Utwórz klasę PersonalJournal posiadającą pole typu TreeMap<LocalDate, String>. Klasa ta powinna posiadać metody pozwalające na:
//- dodanie wpisu do pamiętnika (value) pod wskazaną datą (key), jeżeli jest już tam jakiś wpis to powinien zostać dodany do już istniejącego
//- wypisanie całego pamiętnika w formacie key - value zaczynając od najnowszego wpisu
//- odczytanie wpisu znajdującego się możliwie najbliżej podanej daty

public class PersonalJournal {

    private TreeMap<LocalDate, String> entries = new TreeMap<>();


    public void addEntry(String entry) {
        LocalDate key = LocalDate.now();

        entries.putIfAbsent(key, entry);
        if (entries.get(key) != null){
            String existingMessage = entries.getOrDefault(key, "");

            entries.put(key, existingMessage + "" + entry);
        }
    }

    public void addEntry(LocalDate entryDate ,String entry) {
        String existingMessage = entries.getOrDefault(entryDate, "");
        entries.put(entryDate, existingMessage + " " + entry);
    }

    public void readClosestEntries(LocalDate date) {
        LocalDate ceilingKey = entries.ceilingKey(date);
        long ceilingDifference = ChronoUnit.DAYS.between(date, ceilingKey);

        LocalDate floorKey = entries.floorKey(date);
        long floorDifference = ChronoUnit.DAYS.between(date, floorKey);

        if(ceilingDifference > Math.abs(floorDifference)){
            System.out.println(entries.get(floorKey));
        } else  {
            System.out.println(entries.get(ceilingKey));
        }
    }


}
