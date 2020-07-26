package FilipM.second;

//Na podstawie 100000 elementowej listy z losowo wybranymi wartościami zaimplementuj następujące
//funkcjonalności:
//1. zwróć listę unikalnych elementów,
//2. zwróć listę elementów, które co najmniej raz powtórzyły się w wygenerowanej liście,

import FilipM.first.ListFiller;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> workingList = ListFiller.create(10000);


//        List<Integer> resultList =
//                workingList.stream()
//                .distinct() //usuwa duplikaty
//                .collect(Collectors.toList());
        //nie rozwązuje tego zadania, ale prawie

        List<Integer> resultList = ListWithNoDoubles.getUnique(workingList);

        System.out.println(resultList.toString());
        System.out.println(resultList.size());
    }
}
