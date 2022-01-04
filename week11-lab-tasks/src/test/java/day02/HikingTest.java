package day02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    List<Point> pointListDouble = List.of(
            new Point(1.12,1.45,0.0),
            new Point(2.32,3.43,1.45),
            new Point(5.98,4.67,5.53),
            new Point(6.54,3.34,10.27),
            new Point(7.12,8.78,8.87),
            new Point(5.76,9.98,9.98),
            new Point(4.87,7.76,7.23),
            new Point(1.65,1.44,8.02)
    );

    List<Point> pointList = List.of(
            new Point(1.12,1.45,0),
            new Point(2.32,3.43,1),
            new Point(5.98,4.67,5),
            new Point(6.54,3.34,10),
            new Point(7.12,8.78,8),
            new Point(5.76,9.98,9),
            new Point(4.87,7.76,7),
            new Point(1.65,1.44,8)
    );

    Hiking hiking = new Hiking();

    @Test
    void getPlusElevation() {
        assertEquals(12, hiking.getPlusElevation(pointList));
    }

    @Test
    void getPlusElevationDouble() {
        assertEquals(12.17, hiking.getPlusElevation(pointListDouble));
    }
}