package View;

import Model.Car;
import Model.Road;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    Road fourWay = new Road(300, 0, true);
    Road straight = new Road(0, 300, false);
    Road tSection = new Road(800, 0, true);
    Car car = new Car(straight.getX() + 5, straight.getY() + 5, 1, 0);
    private Model.Shapes[] shapes;
    Timer timer;

    public void animate() {

        Boolean is_animate = Boolean.FALSE;

        while (!is_animate) {
            if (timer != null) {
                timer.stop();
            }
            timer = new Timer(1000 / 60, e -> {
                car.move();
//                trafficLight.setState();
                repaint();
//                car.update(trafficLight.getPositionX(), trafficLight.getPositionY(), trafficLight.getState());

            });
            timer.start();
            is_animate = Boolean.TRUE;
        }

    }
//yotube video


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        straight.paintComponent(g);
        fourWay.paintComponent(g);
        tSection.paintComponent(g);
        car.paintComponent(g);

    }
}