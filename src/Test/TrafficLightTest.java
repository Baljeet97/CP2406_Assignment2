package Test;

import Model.TrafficLight;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TrafficLightTest {

    @Test
    void trafficLights() {

        TrafficLight lights = new TrafficLight(20, 50);
        assertEquals(20, lights.getPositionX());
        assertEquals(50, lights.getPositionY());
    }

    @Test
    void trafficState() {

        TrafficLight lights = new TrafficLight(20, 50);
        assertEquals(TrafficLight.State.STOP, lights.getState());
    }

    @Test
    void lightColor() {

        TrafficLight lights = new TrafficLight(20, 50);
        boolean check = (lights.getColor() == Color.red || lights.getColor() == Color.green);
        assertTrue(check);
    }
}