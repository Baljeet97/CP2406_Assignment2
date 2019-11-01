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
    Road tSection = new Road(890, 0, true);
    Car car = new Car(straight.getX() + 5, straight.getY() + 5, 1, 0);
    Bus bus = new Bus(fourWay.getX() + 60, fourWay.getY() + 5, 1, 0);
    Bike bike = new Bike(tSection.getX() + 60, tSection.getY() + 10, 1, 1);
    TrafficLight trafficLightStraight = new TrafficLight(straight.getX() + straight.getHeight() + 160, straight.getY() - 26, Color.red);
    TrafficLight trafficLightFourWay = new TrafficLight(fourWay.getX() + fourWay.getHeight() - 690, fourWay.getY() + 274, Color.green);


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

            if (timer != null) {
                timer.stop();
            }
            timer = new Timer(1000 / 60, e -> {
                bike.update(trafficLightStraight.getPositionX(), trafficLightStraight.getPositionY(), trafficLightStraight.getState());
                bus.update(trafficLightFourWay.getPositionX(), trafficLightFourWay.getPositionY(), trafficLightFourWay.getState());
                car.update(trafficLightStraight.getPositionX(), trafficLightStraight.getPositionY(), trafficLightStraight.getState());

                bus.move();
                car.move();
                bike.move();
                trafficLightStraight.setState();
                trafficLightFourWay.setState();

                repaint();
            });
            timer.start();

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
        trafficLightFourWay.paintComponent(g);
//        stoplight.paintComponent(g);
    }

}
