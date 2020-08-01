package FilipM.differentExcercise;

//the output should contain the following metrics of the input text:
//        number of words
//        number of sentences (sentence ends with . ? or ! characters, assume that each sentence in the text
//        ends with one of these characters).
//        average amount of words in a sentence (formatted with 2 decimal places).


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

    public static StatsTuple generate(Path fileName) throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(String.valueOf(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(fileReader);

        StatsTuple result = new StatsTuple();
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
                        //todo: nie traktuje końca pliku jako końca słowa
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
        result.setSentenceCounter(sentenceCounter);
        result.setWordsCounter(wordsCounter);
        return result;

    }

}