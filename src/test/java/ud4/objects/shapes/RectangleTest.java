package ud4.objects.shapes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @DisplayName("Rectangle()")
    @Test
    void defaultConstructor(){
        // Arrange
        // Act
        Rectangle r = new Rectangle();

        // Assert
        assertAll(
                () -> assertEquals(0, r.getX()),
                () -> assertEquals(0, r.getY()),
                () -> assertEquals(1, r.getWidth()),
                () -> assertEquals(1, r.getHeight())
        );
    }

    @DisplayName("Rectangle(width, height)")
    @Test
    void constructorWidthHeight(){
        // Arrange
        double width = 1;
        double height = 2;
        // Act
        Rectangle r = new Rectangle(width, height);

        // Assert
        assertAll(
                () -> assertEquals(0, r.getX()),
                () -> assertEquals(0, r.getY()),
                () -> assertEquals(width, r.getWidth()),
                () -> assertEquals(height, r.getHeight())
        );
    }

    @DisplayName("Rectangle(x, y, width, height)")
    @Test
    void constructorWidthHeightXY(){
        // Arrange
        double x = 1;
        double y = 2;
        double width = 3;
        double height = 4;
        // Act
        Rectangle r = new Rectangle(x, y, width, height);

        // Assert
        assertAll(
                () -> assertEquals(x, r.getX()),
                () -> assertEquals(y, r.getY()),
                () -> assertEquals(width, r.getWidth()),
                () -> assertEquals(height, r.getHeight())
        );
    }

    @DisplayName("Rectangle::getArea()")
    @ParameterizedTest(name = "{0}x{1} = {2}")
    @CsvSource({
            "0,0,0",
            "1,0,0",
            "1,1,1",
            "2,3,6",
    })
    void getAreaTests(double width, double height, double expectedArea){
        // Arrange
        Rectangle r = new Rectangle(width, height);

        // Act
        double actualArea = r.getArea();

        // Assert
        assertEquals(expectedArea, actualArea);
    }

    @DisplayName("Rectangle::getPerimeter()")
    @ParameterizedTest(name = "{0}x{1} = {2}")
    @CsvSource({
            "0,0,0",
            "1,0,2",
            "1,1,4",
            "2,3,10",
    })
    void getPerimeterTests(double width, double height, double expectedPerimeter){
        // Arrange
        Rectangle r = new Rectangle(width, height);

        // Act
        double actualPerimeter = r.getPerimeter();

        // Assert
        assertEquals(expectedPerimeter, actualPerimeter);
    }


    @DisplayName("Rectangle::contains(x, y)")
    @ParameterizedTest(name = "r(x={0},y={1},w={2},h={3}) contains (x={4},y={5}): {6}")
    @CsvSource({
            // R(x=0,y=0,w=1,h=1)
            "0,0,1,1,0,0,true", // Vèrtex inferior-esquerra
            "0,0,1,1,1,0,true", // Vèrtex inferior-dreta
            "0,0,1,1,0,1,true", // Vèrtex superior-esquerra
            "0,0,1,1,1,1,true", // Vèrtex superior-dreta
            "0,0,1,1,0.5,2,false", // Dalt
            "0,0,1,1,0.5,-1,false", // Baix
            "0,0,1,1,-1,0.5,false", // Esquerra
            "0,0,1,1,2,0.5,false", // Dreta

            // R(x=0,y=0,w=2,h=3)
            // Vèrtex inferior-esquerra
            // Vèrtex inferior-dreta
            // Vèrtex superior-esquerra
            // Vèrtex superior-dreta
            // Dalt
            // Baix
            // Esquerra
            // Dreta

            // R(x=-1,y=2,w=2,h=3)
            // Vèrtex inferior-esquerra
            // Vèrtex inferior-dreta
            // Vèrtex superior-esquerra
            // Vèrtex superior-dreta
            // Dalt
            // Baix
            // Esquerra
            // Dreta
    })
    void getPerimeterTests(double rx, double ry, double rw, double rh, double px, double py, boolean expected){
        // Arrange
        Rectangle r = new Rectangle(rx, ry, rw, rh);

        // Act
        boolean actual = r.contains(px, py);

        // Assert
        assertEquals(expected, actual);
    }
}