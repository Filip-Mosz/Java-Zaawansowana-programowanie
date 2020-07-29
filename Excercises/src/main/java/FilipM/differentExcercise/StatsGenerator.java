package FilipM.differentExcercise;

//the output should contain the following metrics of the input text:
//        number of words
//        number of sentences (sentence ends with . ? or ! characters, assume that each sentence in the text
//        ends with one of these characters).
//        average amount of words in a sentence (formatted with 2 decimal places).


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StatsGenerator {
    //bufferedReader.read reads single char ->
    // i can assume that if it's equal to [space](\u0020) wrd ends; if its equal to .90\u002e/?(\u003f)/!(\u0021) sentence ends
    static Character character;
    static FileReader fileReader;
    static BufferedReader reader = new BufferedReader(fileReader);
    static int wordsCounter;
    static int sentenceCounter;

    public static StatsTuple generate (int changeIt){
        StatsTuple result = new StatsTuple();

        while (true) {
            String stringOfCharacter = String.valueOf(character);
            try {
                if ((character = (char) reader.read()) != null){
                    if (character.equals(' ')){
                        wordsCounter++;
                    }
                    if (stringOfCharacter.matches("[.!?]")){
                        sentenceCounter++;
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            result.setSentenceCounter(sentenceCounter);
            result.setWordsCounter(wordsCounter);
            return result;
        }


    }

}