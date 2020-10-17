package FilipM.differentExcercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class StatsGenerator {
    //bufferedReader.read reads single char ->
    // i can assume that if it's equal to [space](\u0020) wrd ends; if its equal to .90\u002e/?(\u003f)/!(\u0021) sentence ends
    static Character character;

    static int wordsCounter;
    static int sentenceCounter;
    static double averageWordCounter;

    public static StatsTriple generate(Path fileName) throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(String.valueOf(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(fileReader);

        StatsTriple result = new StatsTriple();
        try {
            fileReader = new FileReader(String.valueOf(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //loop works
        do {
            try {
                if ((character = (char) reader.read()) != null) {
                    if (character.equals(' ')) {
                        wordsCounter++;
                    }
                    if (character.equals('\n')) {
                        wordsCounter++;
                        //break line (probably) done
                    }
                    if (character.equals('\r')) {
                        wordsCounter++;
                        //end of file (probably) done
                    }


                    String stringOfCharacter = String.valueOf(character);
                    if (stringOfCharacter.matches("[.!?]")) {
                        sentenceCounter++;

                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            if (character == '\uFFFF') {
                break;
            }
        } while (character != '\uFFFF');
        averageWordCounter = wordsCounter / sentenceCounter;

        result.setSentenceCounter(sentenceCounter);
        result.setWordsCounter(wordsCounter);
        result.setAverageWordsForSentence(averageWordCounter);
        return result;

    }

}