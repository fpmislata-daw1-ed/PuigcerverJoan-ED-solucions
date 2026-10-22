package ud4.methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ud4.methods.IsLeapYear.isLeapYear;

class IsLeapYearTest {
    @Test
    void notDivisibleBy4_shouldReturnFalse(){
        // Arrange
        int year = 2025;

        // Act
        boolean actual = isLeapYear(year);

        // Assert
        assertFalse(actual);
    }

    @Test
    void divisibleBy4_shouldReturnTrue(){
        // Arrange
        int year = 2024;

        // Act
        boolean actual = isLeapYear(year);

        // Assert
        assertTrue(actual);
    }

    @Test
    void divisibleBy100_shouldReturnFalse(){
        // Arrange
        int year = 1900;

        // Act
        boolean actual = isLeapYear(year);

        // Assert
        assertFalse(actual);
    }

    @Test
    void divisibleBy400_shouldReturnTrue(){
        // Arrange
        int year = 2000;

        // Act
        boolean actual = isLeapYear(year);

        // Assert
        assertTrue(actual);
    }
}