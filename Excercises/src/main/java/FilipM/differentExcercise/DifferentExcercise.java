package FilipM.differentExcercise;

/*Input:
the input text should be taken from the file in the filesystem (assume that it is an UTF-8 plain text).
the name of the file should be provided via the command line.
the text may contain only the following symbols: English letters (a-z, A-Z),
 limited set of punctuation marks (. ! ? ; , :) and whitespaces (space, \t, \r \n).
  Otherwise the error message should be displayed.

Output:
the result of the analysis should be written in UTF-8 encoded HTML-format to the file in the filesystem
feel free to pick the appearance of the result HTML. Please, test it against the Chrome browser.
the name of the output file should be provided via the command line
the output should contain the following metrics of the input text:
number of words
number of sentences (sentence ends with . ? or ! characters, assume that each sentence in the text
 ends with one of these characters).
average amount of words in a sentence (formatted with 2 decimal places).

Build:
should be sent to us as a .zip file with the maven project, which contains TextAnalysisRunner executable class,
 which is the entry point
maven dependencies and the number of the classes in the project are not limited
General code requirements:
take into consideration that in the future the analysing logic can be part of bigger infrastructure,
 so that the text might not be provided via the filename in the command line, but somehow otherwise.
take into consideration that it might be needed in the future to present the analysis result in
 some other formats (JSON etc).
take into consideration that other text metrics might be required in the future.
*/

import java.io.IOException;

public class DifferentExcercise {
    public static void main(String[] args) {
        FileGetter fileReader = new FileGetter("textSupply");

        System.out.println(fileReader);


        try {
            FileGetter.testFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
