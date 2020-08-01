package FilipM.differentExcercise;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class StatsGeneratorTest {

    @Test
    void generate() {
        //given
        StatsTuple generated = null;
        try {
            generated = StatsGenerator.generate(Paths.get("StatsTestFile.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (generated != null) {
            assertEquals(3, generated.getSentenceCounter());
            //green
        }
        assertEquals(8, generated.getWordsCounter());
    }
}