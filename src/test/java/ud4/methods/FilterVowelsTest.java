package ud4.methods;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static ud4.methods.FilterVowels.filterVowel;
import static ud4.methods.FilterVowels.filterVowelRegex;

class FilterVowelsTest {
    /*
    @Test
    void filterVowelMethodShouldExist(){
        filterVowel();
    }
    */

    @Test
    void filterVowelShouldHaveStringParameter(){
        filterVowel("Hola");
    }

    @Test
    void filterVowelShouldReturnString(){
        String result = filterVowel("Hola");
    }

    @ParameterizedTest
    @CsvSource({
            "b,b",
            "a,''",
            "e,''",
            "i,''",
            "o,''",
            "u,''",
            "A,''",
            "E,''",
            "I,''",
            "O,''",
            "U,''",
            "ba,b",
            "Hola,Hl",
            "Hola que tal,Hl q tl",
            "Sóc, Sc"
    })
    void filterVowelTest(String text, String expected){
        String result = filterVowelRegex(text);

        assertEquals(expected, result);
    }

}