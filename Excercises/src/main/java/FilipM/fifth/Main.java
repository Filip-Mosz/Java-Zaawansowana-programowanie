package FilipM.fifth;
//Stwórz klasę Storage , która będzie miała prywatne pole typu Map, publiczny konstruktor oraz metody:
//addToStorage(String key, String value) - dodawanie elementów do przechowywalni
//printValues(String key) - wyświetlanie wszystkich elementów pod danym kluczem
//Klasa Storage powinna pozwalać na przechowywanie wielu wartości pod jednym kluczem.

public class Main {
    public static void main(String[] args) {

        Storage storage = new Storage();

        storage.addToStorage("999", "OTH");
        storage.addToStorage("999", "ALL");
        storage.addToStorage("111", "USD");
        storage.addToStorage("A", "USD");

        storage.printValues("999");
        storage.printValues("A");
        storage.printValues("HELLO");

    }
}
