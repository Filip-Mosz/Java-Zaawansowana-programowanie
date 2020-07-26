package FilipM.third;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Jan", "Zbigniew", "Kunegunda", "Gryzelda", "Zenobi", "Jadwiga"
        );
        System.out.println(names);
        System.out.println("-------");
        reverseSort(names);
        System.out.println(names);

        reverseSortOne(names);
        System.out.println(names);

    }
    //HERE ENDS MAIN -----------------------
    private static void reverseSort(List<String> stringsToBeSorted){
       // Collections.sort(stringsToBeSorted);

         stringsToBeSorted
                .sort(Collections.reverseOrder());

    }
//zrobione przez trenera
    private static void reverseSortOne(List<String> stringsToBeSorted) {
        Collections.sort(stringsToBeSorted, Collections.reverseOrder());
    }

    private static void reverseSortTwo(List<String> stringsToBeSorted) {
        stringsToBeSorted.sort(Collections.reverseOrder());
    }
}
