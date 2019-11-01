package View;

import Model.Road;

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

    CityMenu() {

        setTitle("City Edit Mode");
        setSize(900, 600);
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
            Road straight = new Road(50, 30, true);
        }

    }
}
