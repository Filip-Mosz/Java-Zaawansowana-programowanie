//15* Stwórzmy nową klasę LocationAnalyzer wraz z metodą analizującą jaka miejscowość ma najdłuższą nazwę w Polsce
// i zwracającę listę miejscowości posiadających nadłuższą nazwę.

//15** Stwórzmy w tej klasie metodę zwracającą mapę gdzie kluczem będzie województwo a wartością miejscowości
// o nadłuższej nazwie w województwie.
// Podpowiedź: spróbujmy użyć Collectors.groupingBy() w collect użytym na końcu streama.

//15*** zróbmy testy jednostkowe dla powyższych metod.

//16. Przekażmy wynik działania obu metod do klasy tworzącej plik wynikowy dodając jako ciekawostkę linię
// z tym jakie nazwy miejscowości są nadłuższe w Polsce oraz jakie w danym województwie.

//dorobić menu - typ losowanej lokacji

package org.example;

import org.model.Location;
import org.model.LocationType;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hallo Welt!" );

        List<String> strings = DataLoader.read("TERC.csv");

        List<String> stringsByFiles = DataLoader.readFile("TERC.csv");

        Map<Integer, String> voivodeships = VoivodeshipMapper.map(stringsByFiles);
        List<Location> locations = LocationMapper.mapLocations(stringsByFiles, voivodeships);
        Location randomLocation = VacationTargetGenerator.getRandomLocation(locations);
        generateInvitationFile.generateInvitation(randomLocation, "test.txt");

        System.out.println("Lokacja" + randomLocation);

        System.out.println(LocationAnalyzer.hasLongestName(locations));
        System.out.println("--------------fancy spacer-----------------");

        //menu
        String option = "";
        StringBuilder menu = new StringBuilder().append("What would you like to do?" + System.lineSeparator())
                .append("Draw location -> 1" + System.lineSeparator())
                .append("Set preferred destination type -> 2" + System.lineSeparator())
                .append("Quit -> q");

        StringBuilder locationMenu = new StringBuilder().append("What would you like to do?" + System.lineSeparator())
                .append("See some nice polish Village -> 1")
                .append(System.lineSeparator())
                .append("Small town, close to nature -> 2")
                .append(System.lineSeparator())
                .append("See a city, and maybe shopping -> 3")
                .append(System.lineSeparator())
                .append("I've change my mind (main menu) -> 0");
        Location preferredLocation = null;
        do{
            System.out.println(menu);
            option = new Scanner(System.in).nextLine();
            switch (option){
                case "1": {
                    System.out.println("To jest pierwsza opcja");
                randomLocation = VacationTargetGenerator.getRandomLocation(locations);
                    System.out.println("Your vacation target is: " + randomLocation);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        System.out.println("Ktoś obudził śpiący wątek; teraz będzie marudził z niewyspania :(");
                    }
                    break;}

                case "2":{
                    System.out.println("2 has been chosen");
                    System.out.println(locationMenu);
                    option = new Scanner(System.in).nextLine();
                    switch (option){

                        case ("1"):{
                            preferredLocation = VacationTargetGenerator.getRandomLocation(locations, LocationType.VILLAGE);
                            System.out.println(preferredLocation);
                            break;
                        }
                        case ("2"):{
                            preferredLocation = VacationTargetGenerator.getRandomLocation(locations, LocationType.URBAN_RURAL);
                            System.out.println(preferredLocation);
                            break;
                        }
                        case ("3"):{
                            preferredLocation = VacationTargetGenerator.getRandomLocation(locations, LocationType.CITY);
                            System.out.println(preferredLocation);
                            break;
                        }

                    }
                    break;
                }
            }

        }while (!"q".equals(option));

    }
}
