package Controller;

import Model.*;
import View.MainMenu;
import View.SimMenu;

import javax.swing.*;
import java.awt.*;

public class Controller extends JPanel {
    Timer timer;

    SimMenu menu = new SimMenu();
    Road straight = new Road(0, 300, false);
    Road fourWay = new Road(300, 0, true);
    Road tSection = new Road(800, 0, true);
    Car car = new Car(straight.getX() + 5, straight.getY() + 5, 1, 0);
    Bus bus = new Bus(fourWay.getX() + 60, fourWay.getY() + 10, 0, 1);
    Bike bike = new Bike(tSection.getX() + 60, tSection.getY() + 10, 1, 1);
    TrafficLight trafficLightStraight = new TrafficLight(straight.getX() + straight.getHeight() + 150, straight.getY() - 26, Color.red);


    public Controller() {
        super();
        add(menu.start);
        add(menu.stop);
        menu.start.addActionListener(actionEvent -> animate());
        menu.stop.addActionListener(actionEvent -> stop());

    }

    public static void main(String[] args) {
        MainMenu menu = new MainMenu();

    }

    public static void simulationMenu() {
        JFrame frame = new JFrame();
        frame.add(new Controller());
        frame.setSize(1000, 700);
        frame.setVisible(true);
        frame.setTitle("Simulator");
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }

    private void animate() {

        Boolean is_animate = Boolean.FALSE;

        while (!is_animate) {
            if (timer != null) {
                timer.stop();
            }
            timer = new Timer(1000 / 60, e -> {
                bus.move();
                car.update(trafficLightStraight.getPositionX(), trafficLightStraight.getPositionY(), trafficLightStraight.getState());
                car.move();
                bike.move();
                trafficLightStraight.setState();
                repaint();
                bus.update(trafficLightStraight.getPositionX(), trafficLightStraight.getPositionY(), trafficLightStraight.getState());

                bike.update(trafficLightStraight.getPositionX(), trafficLightStraight.getPositionY(), trafficLightStraight.getState());

            });
            timer.start();
            is_animate = Boolean.TRUE;
        }

    }

    private void stop() {
        timer.stop();

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        straight.paintComponent(g);
        fourWay.paintComponent(g);
        tSection.paintComponent(g);
        car.paintComponent(g);
        bus.paintComponent(g);
        bike.paintComponent(g);
        trafficLightStraight.paintComponent(g);
//        stoplight.paintComponent(g);
    }

}
