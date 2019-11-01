package Test;

import Model.Road;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoadTest {
    @Test
    void bikeTest() {

        Road road = new Road(50, 20, true);
        assertEquals(50, road.getX());
        assertEquals(20, road.getY());
        assertEquals(true, road.getVertical());
    }

    @Test
    void horizontalDimensions() {

        Road road = new Road(50, 20, true);
        assertEquals(800, road.getHeight());
        assertEquals(100, road.getWidth());
    }

    @Test
    void verticalDimensions() {

        Road road = new Road(50, 20, false);
        assertEquals(100, road.getHeight());
        assertEquals(950, road.getWidth());
    }
}