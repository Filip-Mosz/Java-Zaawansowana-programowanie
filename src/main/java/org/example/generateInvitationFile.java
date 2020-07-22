package org.example;

import org.model.Location;

import java.io.FileWriter;
import java.io.IOException;

public class generateInvitationFile {
    //Wynik powyższej metody przekażemy do metody generateInvitationFile().
    // Metoda ta powinna wygenerować plik txt w którym będzie informacja o tym,
    // jaka gmina została wylosowana oraz w jakim województwie wplecione w miły
    // tekst powitalny i dziękujący za skorzystanie z naszej aplikacji.

    public static void generateInvitation(Location location, String path) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write(location.toString());
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Somethin's wrong");
        } finally {

        }
    }
}
