package ud4.methods;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static ud4.methods.NextSecond.nextSecond;

class NextSecondTest {
    @ParameterizedTest(name="h:{0},m:{1},s:{2} -> {3}")
    @CsvSource({
            "0,0,0,00:00:01",
            "0,0,59,00:01:00",
            "0,59,59,01:00:00",
            "23,59,59,00:00:00"
    })
    void nextSecondTest(int h, int m, int s, String expected){
        // Act
        String actual = nextSecond(h, m, s);

        // Assert
        assertEquals(expected, actual);
    }
}