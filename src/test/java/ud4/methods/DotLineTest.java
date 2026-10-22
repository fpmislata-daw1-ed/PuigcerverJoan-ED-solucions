package ud4.methods;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static ud4.methods.DotLine.dotLine;

class DotLineTest {
    @ParameterizedTest
    @CsvSource(value = {
            "0,''",
            "1,.",
            "5,.....",
    })
    void testValidDotLine(int length, String expected){
        String actual = dotLine(length);

        assertEquals(expected, actual);
    }

    @Test
    void negativeLength(){
        int length = -5;

        assertThrows(IllegalArgumentException.class, () -> dotLine(length));
    }

}