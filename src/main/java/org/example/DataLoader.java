package org.example;

//Utwórzmy poza pakietem model klasę DataLoader której główna publiczna metoda będzie przyjmować argument
// typu String ze ścieżką do pliku a metoda będzie zwracać List<String> zawierającą poszczególne rzędy
// wczytane z pliku. Obsłużmy wewnątrz klasy exception związany z nieznalezieniem pliku.
// Zwracajmy w tym przypadku pustą listę i wydrukujmy do konsoli komunikat o błędzie.

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DataLoader {

    public List<String> read(String text){
        Files.readString(Paths.get("TERC.csv"));

        return null;
    }
}
