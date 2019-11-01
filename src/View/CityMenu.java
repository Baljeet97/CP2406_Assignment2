package View;

import Model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CityMenu extends JFrame implements ActionListener {

    /*Menu and Items*/

    private JMenuItem save = new JMenuItem("Save file");
    private JMenuItem load = new JMenuItem("Load file");

    private JMenuItem addStraightRoad = new JMenuItem("Straight Road");
    private JMenuItem addTSection = new JMenuItem("T-Intersection");
    private JMenuItem addFourWay = new JMenuItem("4-way road");

    private JMenuItem trafficLights = new JMenuItem("Traffic Lights");

    private JMenuItem addCar = new JMenuItem("Car");
    private JMenuItem addBus = new JMenuItem("Bus");
    private JMenuItem addBike = new JMenuItem("Bike");

    /*pre setting dimensions of all the elements*/

    private Road straight = new Road(0, 300, false);
    private Road fourWay = new Road(300, 0, true);
    private Road tSection = new Road(890, 0, true);

    /*Drawing vehicles and Traffic lights according to the roads*/

    private Car car = new Car(straight.getX() + 5, straight.getY() + 5, 1, 0);
    private Bus bus = new Bus(fourWay.getX() + 60, fourWay.getY() + 5, 1, 0);
    private Bike bike = new Bike(tSection.getX() + 60, tSection.getY() + 10, 1, 1);
    private TrafficLight trafficLightStraight = new TrafficLight(straight.getX() + straight.getHeight() + 160, straight.getY() - 26, Color.red);

    CityMenu() {
        /*adding to variables to JFrame and adding ActionListener*/

        setTitle("City Edit Mode");
        int WIDTH = 1000; //panel width
        int HEIGHT = 800; //panel height
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLayout(new FlowLayout());
        JMenuBar cityMenu = new JMenuBar();
        setJMenuBar(cityMenu);

        JMenu file = new JMenu("File");
        cityMenu.add(file);

        JMenu roads = new JMenu("Add Road");
        cityMenu.add(roads);

        JMenu lights = new JMenu("Add Traffic Lights");
        cityMenu.add(lights);

        JMenu vehicle = new JMenu("Add Vehicle");
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

        /*ActionListeners*/
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
        /*Drawing Vehicles, roads and Lights by calling different methods*/

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
        } else if (source == trafficLights) {
            paintLight(getGraphics());
        } else if (source == addBike) {
            paintBike(getGraphics());
        } else if (source == addBus) {
            paintBus(getGraphics());
        } else if (source == addCar) {
            paintCar(getGraphics());
        }
    }

    /*Methods to paint elements*/

    private void paintStraightRoad(Graphics g) {
        super.paintComponents(g);
        straight.paintComponent(g);
    }

    private void paintFourWayRoad(Graphics g) {
        super.paintComponents(g);
        fourWay.paintComponent(g);
    }

    private void paintTSection(Graphics g) {
        super.paintComponents(g);
        tSection.paintComponent(g);
    }

    private void paintCar(Graphics g) {
        super.paintComponents(g);
        car.paintComponent(g);
    }

    private void paintBus(Graphics g) {
        super.paintComponents(g);
        bus.paintComponent(g);
    }

    private void paintBike(Graphics g) {
        super.paintComponents(g);
        bike.paintComponent(g);
    }

    private void paintLight(Graphics g) {
        super.paintComponents(g);
        trafficLightStraight.paintComponent(g);
    }
}
