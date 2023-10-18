package edu.hw2.Task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {
    @Test
    @DisplayName("Rectangle test")
    void rectangleTest() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertThat(rectangle.area()).isEqualTo(6);

        Rectangle modifiedWidthRectangle = rectangle.setWidth(4);
        assertThat(rectangle.area()).isEqualTo(6);
        assertThat(modifiedWidthRectangle.area()).isEqualTo(12);

        Rectangle modifiedHeightRectangle = rectangle.setHeight(4);
        assertThat(rectangle.area()).isEqualTo(6);
        assertThat(modifiedHeightRectangle.area()).isEqualTo(8);
    }

    @Test
    @DisplayName("Square test")
    void squareTest() {
        Square square = new Square(3);
        assertThat(square.area()).isEqualTo(9);

        Square modifiedSquare = square.setWidth(4);
        assertThat(square.area()).isEqualTo(9);
        assertThat(modifiedSquare.area()).isEqualTo(16);
    }

    @Test
    @DisplayName("Substitution test")
    void substitutionTest() {
        Square square = new Square(3);
        assertThat(square.area()).isEqualTo(9);

        Rectangle modifiedWidthSquare = square.setWidth(4);
        assertThat(modifiedWidthSquare.area()).isEqualTo(16);

        Rectangle modifiedHeightSquare = modifiedWidthSquare.setHeight(5);
        assertThat(modifiedHeightSquare.area()).isEqualTo(25);
    }
}
