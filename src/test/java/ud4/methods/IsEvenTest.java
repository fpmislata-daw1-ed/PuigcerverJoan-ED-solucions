package ud4.methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ud4.methods.IsEven.isEven;

class IsEvenTest {
    @Test
    void givenNumberTwo_shouldReturnTrue(){
        // Arrange
        int n = 2;

        // Act
        boolean result = isEven(n);

        // Assert
        assertTrue(result);
    }

    @Test
    void givenNumberThree_shouldReturnFalse(){
        // Arrange
        int n = 3;

        // Act
        boolean result = isEven(n);

        // Assert
        assertFalse(result);
    }

    @Test
    void givenNumberZero_shouldReturnTrue(){
        // Arrange
        int n = 0;

        // Act
        boolean result = isEven(n);

        // Assert
        assertTrue(result);
    }
}