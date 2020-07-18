package org.example;

//Utwórzmy poza pakietem model klasę DataLoader której główna publiczna metoda będzie przyjmować argument
// typu String ze ścieżką do pliku a metoda będzie zwracać List<String> zawierającą poszczególne rzędy
// wczytane z pliku. Obsłużmy wewnątrz klasy exception związany z nieznalezieniem pliku.
// Zwracajmy w tym przypadku pustą listę i wydrukujmy do konsoli komunikat o błędzie.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class DataLoader {

    public static List<String> read(String text){

        List<String> result = new LinkedList<>();
// próbowałem tak, ale się nie znam :|
//        try {
//            result = new LinkedList<>( Files.readAllLines(Paths.get("text")));
//        } catch (IOException e) {
//            //e.printStackTrace();
//            System.out.println("File not found!");
//        }

        FileReader fileReader = null;

        try {
            fileReader = new FileReader(text);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null){
                result.add(line);
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        } catch (IOException e) {
            System.out.println("Something is not yes ;)");
        }


        return result;
    }
}
