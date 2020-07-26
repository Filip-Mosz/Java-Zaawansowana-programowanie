package FilipM.core;

import FilipM.model.Vehicle;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class CalculatorTest {

    private List<Vehicle> vehicles = List.of(
        new Vehicle("187", 50, 3),
        new Vehicle("187", 16, 4),
        new Vehicle("187", 41, 0),
        new Vehicle("187", 20, 3),
       new Vehicle("47", 54, -2),
        new Vehicle("N7", 18, 9)
    );

    @Test
    public void avgSpeed() {
        //given

        Double result = Calculator.avgSpeed(vehicles);

        assertEquals(33.166666666666664, result, 0.00000000000000000);
    }

    @Test
    public void avgSpeedByLine() {
        Map<String, Double> result = Calculator.avgSpeedByLine(vehicles);

        Double avg187 = result.get("187");
        assertEquals(31.75, avg187, 0.000000000);
    }

    @Test
    public void avgSpeedForGivenLine() {
        Double result1 = Calculator.avgSpeedForGivenLine("187", vehicles);
        Double result2 = Calculator.avgSpeedForGivenLine("N7", vehicles);

        assertEquals(31.75, result1, 0);
        assertEquals(18.0, result2, 0);
    }
}