package Test;

import Model.Bus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BusTest {
    @Test
    void busTest() {
        Bus bus = new Bus(50, 20, 1, 0);
        assertEquals(50, bus.getX());
        assertEquals(20, bus.getY());
        assertEquals(1, bus.getxDir());
        assertEquals(0, bus.getyDir());
    }
}