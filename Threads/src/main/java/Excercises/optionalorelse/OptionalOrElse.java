package Excercises.optionalorelse;

import java.util.List;
import java.util.Optional;

public class OptionalOrElse {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = List.of(-1, -2, -20, -5);

        Optional<Integer> firstPositiveNumberOptionalOne = listOfIntegers.stream().filter(x -> x > 0).findFirst();
        Integer result;
        //will throw java.util.NoSuchElementException: No value present
        //result = firstPositiveNumberOptionalOne.get();

        List<Integer> listOfIntegersWithOnePositive = List.of(-1, -2, -20, -5, 1);

        Optional<Integer> firstPositiveNumberOptionalTwo = listOfIntegersWithOnePositive.stream().filter(x -> x > 0).findFirst();
        //will call method even when no need for default
        result = firstPositiveNumberOptionalTwo.orElse(generateDefaultInteger());
        //won't call method when no need for default
        result = firstPositiveNumberOptionalTwo.orElseGet(() -> generateDefaultInteger());

    }


    private static Integer generateDefaultInteger() {
        System.out.println("I'm starting to generate default double");
        Integer defaultInteger = 0;
        System.out.println("I have generated some default double and I will return it now");
        return defaultInteger;
    }
}
