package FilipM.first;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListFiller {
    public static List<Integer> create (int bound){
        List<Integer> result = new LinkedList<Integer>();
        for (int i = 0; i < bound; i++){
            int nextInt = new Random().nextInt(bound + 1);
            result.add(nextInt);
        }

        return result;
    }
}
