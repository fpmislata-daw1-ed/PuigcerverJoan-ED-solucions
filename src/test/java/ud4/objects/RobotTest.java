package ud4.objects;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {
    @DisplayName("Robot(x,y,speed)")
    @Nested
    class FullAttributeConstructorTests {
        @Test
        void normalValues(){
            // Arrange
            // Act
            Robot robot = new Robot(1, 2, 5);
            // Assert
            assertAll(
                    () -> assertEquals(1, robot.getX()),
                    () -> assertEquals(2, robot.getY()),
                    () -> assertEquals(5, robot.getSpeed())
            );
        }

        @Test
        void negaiveSpeed(){
            // Arrange
            // Act
            Robot robot = new Robot(1, 2, -5);
            // Assert
            assertAll(
                    () -> assertEquals(1, robot.getX()),
                    () -> assertEquals(2, robot.getY()),
                    () -> assertEquals(0, robot.getSpeed())
            );
        }

        @Test
        void moreThenMaximumSpeed(){
            // Arrange
            // Act
            Robot robot = new Robot(1, 2, 15);
            // Assert
            assertAll(
                    () -> assertEquals(1, robot.getX()),
                    () -> assertEquals(2, robot.getY()),
                    () -> assertEquals(10, robot.getSpeed())
            );
        }
    }

    @Nested
    @DisplayName("Robot()")
    class DefaultConstructorTests {
        @Test
        void defaultTest(){
            // Arrange
            // Act
            Robot robot = new Robot();
            // Assert
            assertAll(
                    () -> assertEquals(0, robot.getX()),
                    () -> assertEquals(0, robot.getY()),
                    () -> assertEquals(1, robot.getSpeed())
            );
        }
    }

    @DisplayName("Robot::deccelearate()")
    @ParameterizedTest
    @CsvSource({
            "0,0",
            "0.1,0",
            "0.5,0",
            "10,9.5"
    })
    void deccelerate(double initialSpeed, double expected){
        // Arrange
        Robot robot = new Robot(0, 0, initialSpeed);

        // Act
        robot.deccelerate();

        // Assert
        assertEquals(expected, robot.getSpeed());
    }

    @DisplayName("Robot::up()")
    @ParameterizedTest
    @CsvSource({
            "0,0,0",
            "0,1,1",
            "1,1,2",
            "-4,2,-2",
    })
    void up(double initialY, double initialSpeed, double expectedY){
        // Arrange
        Robot robot = new Robot(0, initialY, initialSpeed);

        // Act
        robot.up();

        // Assert
        assertEquals(expectedY, robot.getY());
    }
}