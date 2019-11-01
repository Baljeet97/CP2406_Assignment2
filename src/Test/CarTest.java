package Test;

import Model.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {
    @Test
    void bikeTest() {

        Car car = new Car(50, 20, 1, 0);
        assertEquals(50, car.getX());
        assertEquals(20, car.getY());
        assertEquals(1, car.getxDir());
        assertEquals(0, car.getyDir());
    }
}