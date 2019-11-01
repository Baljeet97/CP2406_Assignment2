package Controller;

import Model.*;
import View.MainMenu;
import View.SimMenu;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Controller extends JPanel {

    private Timer timer;
    private static final Random random = new Random();

    private Road straight = new Road(0, 300, false);
    private Road fourWay = new Road(300, 0, true);
    private Road tSection = new Road(890, 0, true);
    private Car car = new Car(straight.getX() + 5, straight.getY() + 5, 1, 0);
    private Bus bus = new Bus(fourWay.getX() + 60, fourWay.getY() + 5, 1, 0);
    private Bike bike = new Bike(tSection.getX() + 60, tSection.getY() + 10, 1, 1);
    private TrafficLight trafficLightStraight = new TrafficLight(straight.getX() + straight.getHeight() + 160, straight.getY() - 26);
    private TrafficLight trafficLightFourWay = new TrafficLight(fourWay.getX() + fourWay.getHeight() - 690, fourWay.getY() + 274);

    private Controller() {

        super();
        SimMenu menu = new SimMenu();
        add(menu.start);
        add(menu.stop);
        menu.start.addActionListener(actionEvent -> animate());
        menu.stop.addActionListener(actionEvent -> stop());
    }

    public static void main(String[] args) {
        new MainMenu();
    }

    public static void simulationMenu() {

        JFrame frame = new JFrame();
        frame.add(new Controller());
        frame.setSize(1000, 700);
        frame.setVisible(true);
        frame.setResizable(false);
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

            //To check if both lights not in same state
            if (trafficLightStraight.getState() == TrafficLight.State.GO) {
                trafficLightFourWay.setColor(Color.red);
            } else if (trafficLightStraight.getState() == TrafficLight.State.STOP) {
                trafficLightFourWay.setColor(Color.green);
            }
            repaint();
        });
        timer.start();
    }


    private void stop() {
        timer.stop();
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        int cars = 10;

        straight.paintComponent(g);
        fourWay.paintComponent(g);
        tSection.paintComponent(g);

        bus.paintComponent(g);
        bike.paintComponent(g);
        trafficLightStraight.paintComponent(g);
        trafficLightFourWay.paintComponent(g);

        Model.Vehicle[] vehicles = new Model.Vehicle[cars];
        for (int i = 0; i < vehicles.length; ++i) {
            vehicles[i] = new Model.Car(straight.getX() + 10, straight.getY() + 5, 1, 0);
            car.paintComponent(g);
        }
    }
}
