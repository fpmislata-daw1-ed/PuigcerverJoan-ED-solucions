package ud4.methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ud4.methods.FizzBuzz.fizzBuzz;

class FizzBuzzTest {
    /*
    @Test
    void methodFizzBuzzShouldExist(){
        fizzBuzz();
    }
     */

    @Test
    void fizzBuzzShouldHaveIntParameter(){
        fizzBuzz(1);
    }

    @Test
    void fizzBuzzShouldReturnNumber(){
        String result = fizzBuzz(1);
    }

    @Test
    void given1_shouldReturn1(){
        String result = fizzBuzz(1);

        assertEquals("1", result);
    }

    @Test
    void given2_shouldReturn2(){
        String result = fizzBuzz(2);

        assertEquals("2", result);
    }

    @Test
    void given3_shouldReturnFizz(){
        String result = fizzBuzz(3);

        assertEquals("Fizz", result);
    }

    @Test
    void given5_shouldReturnBuzz(){
        String result = fizzBuzz(5);

        assertEquals("Buzz", result);
    }

    @Test
    void given6_shouldReturnFizz(){
        String result = fizzBuzz(6);

        assertEquals("Fizz", result);
    }

    @Test
    void given10_shouldReturnBuzz(){
        String result = fizzBuzz(10);

        assertEquals("Buzz", result);
    }

    @Test
    void given15_shouldReturnFizzBuzz(){
        String result = fizzBuzz(15);

        assertEquals("FizzBuzz", result);
    }
    @Test
    void given30_shouldReturnFizzBuzz(){
        String result = fizzBuzz(30);

        assertEquals("FizzBuzz", result);
    }
}