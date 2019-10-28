package View;

import Model.Car;
import Model.Road;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    Road road = new Road(10, 100, Color.darkGray, true);
    Road road2 = new Road(210, 100, Color.darkGray, false);
    Car car = new Car(road.getX() + 5, road.getY() + 5, 1, 0);
    private Model.Shapes[] shapes;
    private Timer timer;

    public void animate() {
        Boolean is_animate = Boolean.FALSE;

        while (!(is_animate)) {
            if (timer != null) {
                timer.stop();
            }
            timer = new Timer(1000 / 60, e -> {
                car.move();
                repaint();
            });
            timer.start();
            is_animate = Boolean.TRUE;
        }
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        car.paintComponent(g);
        road.paintComponent(g);
        road2.paintComponent(g);
    }
}
