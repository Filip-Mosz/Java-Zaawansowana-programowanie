package FilipM.fourth;
//Stwórz metodę, która jako parametr przyjmuje mapę, gdzie kluczem jest
//string, a wartością liczba, a
//następnie wypisuje każdy element mapy do konsoli w formacie: Klucz: <k>, Wartość: <v>. Na końcu
//każdego wiersza poza ostatnim, powinien być przecinek, a w ostatnim kropka.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> items = new HashMap<>();
        items.put("PEN", 10);
        items.put("PINAPPLE", 45);
        items.put("BANANA", 2000);
        items.put("PAPER", 36);
        items.put("BRUSH", 8);

        mapPrinter(items);
    }

    private static void mapPrinter(Map<String, Integer> items){
       //Dostarczone przez Damiana N

        StringBuilder stringBuilder = new StringBuilder();
        Iterator<Map.Entry<String, Integer>> iterator = items.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> item = iterator.next();
            stringBuilder.append("Klucz: ")
                    .append(item.getKey())
                    .append(", Wartość: ")
                    .append(item.getValue());
            if(iterator.hasNext()){
                stringBuilder.append(",")
                        .append(System.lineSeparator());
            }else{
                stringBuilder.append(".");
            }
        }
        System.out.println(stringBuilder);
    }
}
