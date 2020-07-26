package FilipM.first;
//Utwórz listę 1_000_000 randomowo wygenerowanych intów w zakresie od 0 do 1_000_000 .
// Następnie przefiltruj ją i metodą findAny() lub findFirst() zwróć wartość która wynosi powyżej 999_995.
// Jeżeli jest obecna wydrukuj taką informację do konsoli.

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pierwsze zadanie");
        List<Integer> workingList = ListFiller.create(1000000);

        workingList.stream()
            .filter(number -> number > 999_995)//najpierw filtr
            .findAny()//jeśli coś złapało się w filtr
            .ifPresent(System.out::println); //gdyby nie to, trzeba by przekazać do optionala, żeby zabezpieczyć się przed NullPointerem

    }
}
