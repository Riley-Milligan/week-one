import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LineTest {

    Double delta = .0001;

    @Test
    public void canGetSlope() {
        Line line = new Line(1, 1, 4, 4);

        assertEquals(1, line.getSlope(), delta);
        assertNotEquals(2, line.getSlope(), delta);
    }

    @Test
    public void canGetDistance() {
        Line line = new Line(1, 1, 1, 4);

        assertEquals(3, line.getDistance(), delta);
        assertNotEquals(5, line.getDistance(), delta);
    }

    @Test
    public void canCheckParallels() {
        Line line = new Line(1, 1, 4, 4);
        Line line2 = new Line(3, 3, 6, 6);
        Line line3 = new Line(1, 1, 2, 4);

        assertTrue(line.parallelTo(line2));
        assertFalse(line.parallelTo(line3));
    }

    @Test
    public void cannotDivideByZero() {
        Line line = new Line(1, 1, 1, 4);
        Line line2 = new Line(1, 1, 4, 4);


        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            line.parallelTo(line2);
        });

        assertEquals("Divide by zero error", exception.getMessage());
    }
}
