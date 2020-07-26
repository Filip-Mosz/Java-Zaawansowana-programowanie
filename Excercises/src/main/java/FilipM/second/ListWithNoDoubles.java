package FilipM.second;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListWithNoDoubles {
    public static List<Integer> getUnique(List<Integer> list){
        Map<Integer, Long> numbersWithOccurence = list.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        return numbersWithOccurence
                .entrySet()
                .stream()
                .filter(element -> element.getValue() ==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
    public static List<Integer> getNonUnique(List<Integer> numbers) {
        return groupByOccurrence(numbers).entrySet().stream()
                .filter(element -> element.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    private static Map<Integer, Long> groupByOccurrence(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
    }
}
