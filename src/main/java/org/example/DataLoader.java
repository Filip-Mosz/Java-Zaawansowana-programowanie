package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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

        FileReader fileReader;

        try {
            fileReader = new FileReader(text);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null){
                result.add(line);
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
            return new LinkedList<>();
        } catch (IOException e) {
            System.out.println("Error accesing file");
        }


        return result;
    }

    public static List<String> readFile (String text){
        List<String> result = new LinkedList<>();

        try {
            return new LinkedList<>( Files.readAllLines(Paths.get(text)));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found!");
        }

        return result;
    }
}
