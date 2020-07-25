package Excercises.Excercise1;
//Utwórz klasę Counter z polem typu int count. Utwórz dwie metody - increment i decrement zmieniające
// wartość tego pola o 1. Utwórz dwie klasy rozszerzające klasę Thread, jedna niech się nazywa IncrementingThread,
// druga DecrementingThread. Niech posiadają pole typu Counter. Przekaż Counter jako parametr konstruktora.
// Nadpisz metody run - jedna z klas niech w pętli 10000 razy użyje metody increment, druga decrement.
// Nadpisz metodę start aby drukowała aktualną godzinę i nazwę wątku (getName()) ale nie usuwaj z niej
// uruchomienia orginalnej implementacji.
//Utwórz klasę z metodą main, w niej obiekty: Counter, IncrementingThread, DecrementingThread
// . Uruchom wątki metodą start. Wydrukuj na koniec wartość pola counter. Sprawdź wykonanie programu,
// omówmy sekwencję działania.
//Stwórz dwa kolejne wątki, jednak użyj konstruktora do którego przekażesz instancję runnable,
// wołającej bezpośrednio na instancji counter odpowiednio increment i decrement.
//Sprawdź wyniki.
//Omówmy jak zabezpieczyć klasę Counter.

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        IncrementingThread threadOne = new IncrementingThread(counter);
        DecrementingThread threadTwo = new DecrementingThread(counter);

        threadOne.start();
        threadTwo.start();

        threadOne.join();
        threadTwo.join();

        System.out.println(counter);
    }
}
