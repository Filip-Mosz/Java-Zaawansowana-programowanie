package FilipM.sixth;

//Utwórz klasę UnderageException dziedziczącą po klasie exception.
// Stwórz klasę AgeValidator z metodą validate, która po otrzymaniu LocalDate z datą urodzenia sprawdzi
// czy dana osoba jest pełnoletnia na dzisiejszy dzień. Jeżeli tak to powinna zostać wydrukowana
// wiadomość o byciu pełnoletnim. Jeżeli nie, to powinien zostać rzucony powyższy wyjątek.

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate person1 = LocalDate.of(1989, 4, 28);
        LocalDate person2 = LocalDate.of(2003, 12, 18);
        LocalDate person3 = LocalDate.of(2001, 12, 18);

        try {
            System.out.println(AgeValidator(person1));
        } catch (UnderageException e) {
            System.out.println("Person is underaged!");
        }
        try {
            System.out.println(AgeValidator(person2));
        } catch (UnderageException e) {
            System.out.println("Person is underaged!");
        }
        try {
            System.out.println(AgeValidator(person3));
        } catch (UnderageException e) {
            System.out.println("Person is underaged!");
        }

    }

    public static String AgeValidator(LocalDate birthDate) throws UnderageException {


        if (birthDate.plusYears(18).isAfter(LocalDate.now())) {
            throw new UnderageException();
        } else return "Person is of age.";
    }
}
