package Test;

import Model.Bike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BikeTest {

    @Test
    void bikeTest() {
        Bike bike = new Bike(50, 20, 1, 0);
        assertEquals(50, bike.getX());
        assertEquals(20, bike.getY());
        assertEquals(1, bike.getxDir());
        assertEquals(0, bike.getyDir());
    }
}