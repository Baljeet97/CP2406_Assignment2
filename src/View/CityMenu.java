package View;

import Model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CityMenu extends JFrame implements ActionListener {


    JMenu file = new JMenu("File");
    JMenuItem save = new JMenuItem("Save file");
    JMenuItem load = new JMenuItem("Load file");

    JMenu roads = new JMenu("Add Road");
    JMenuItem addStraightRoad = new JMenuItem("Straight Road");
    JMenuItem addTSection = new JMenuItem("T-Intersection");
    JMenuItem addFourWay = new JMenuItem("4-way road");

    JMenu lights = new JMenu("Add Traffic Lights");
    JMenuItem trafficLights = new JMenuItem("Traffic Lights");

    JMenu vehicle = new JMenu("Add Vehicle");
    JMenuItem addCar = new JMenuItem("Car");
    JMenuItem addBus = new JMenuItem("Bus");
    JMenuItem addBike = new JMenuItem("Bike");


    final int WIDTH = 1000;
    final int HEIGHT = 800;
    Road straight = new Road(0, 300, false);
    Road fourWay = new Road(300, 0, true);
    Road tSection = new Road(890, 0, true);
    Car car = new Car(straight.getX() + 5, straight.getY() + 5, 1, 0);
    Bus bus = new Bus(fourWay.getX() + 60, fourWay.getY() + 5, 1, 0);
    Bike bike = new Bike(tSection.getX() + 60, tSection.getY() + 10, 1, 1);
    TrafficLight trafficLightStraight = new TrafficLight(straight.getX() + straight.getHeight() + 160, straight.getY() - 26, Color.red);
    TrafficLight trafficLightFourWay = new TrafficLight(fourWay.getX() + fourWay.getHeight() - 690, fourWay.getY() + 274, Color.green);

    CityMenu() {
        setTitle("City Edit Mode");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        JMenuBar cityMenu = new JMenuBar();
        setJMenuBar(cityMenu);


        cityMenu.add(file);

        cityMenu.add(roads);

        cityMenu.add(lights);

        cityMenu.add(vehicle);


        file.add(load);

        file.add(save);


        roads.add(addStraightRoad);

        roads.add(addTSection);

        roads.add(addFourWay);

        lights.add(trafficLights);

        vehicle.add(addCar);
        vehicle.add(addBus);
        vehicle.add(addBike);

        load.addActionListener(this);
        save.addActionListener(this);
        addStraightRoad.addActionListener(this);
        addTSection.addActionListener(this);
        addFourWay.addActionListener(this);
        trafficLights.addActionListener(this);
        addCar.addActionListener(this);
        addBus.addActionListener(this);
        addBike.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == load) {
            JOptionPane.showMessageDialog(null, "File Loaded!");
        } else if (source == save) {
            JOptionPane.showMessageDialog(null, "File Saved!");
        } else if (source == addStraightRoad) {
            paintStraightRoad(getGraphics());
        } else if (source == addFourWay) {
            paintFourWayRoad(getGraphics());
        } else if (source == addTSection) {
            paintTSection(getGraphics());
        }

    }


    public void paintStraightRoad(Graphics g) {
        super.paintComponents(g);
        straight.paintComponent(g);
    }


    public void paintFourWayRoad(Graphics g) {
        super.paintComponents(g);
        fourWay.paintComponent(g);

    }

    public void paintTSection(Graphics g) {
        super.paintComponents(g);
        tSection.paintComponent(g);

    }
}
