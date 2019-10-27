package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CityMenu extends JFrame implements ActionListener {

    CityMenu() {
        setTitle("City Edit Mode");
        setSize(900, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        JMenuBar cityMenu = new JMenuBar();
        setJMenuBar(cityMenu);

        JMenu file = new JMenu("File");
        cityMenu.add(file);
        JMenu roads = new JMenu("Add Road");
        cityMenu.add(roads);
        JMenu lights = new JMenu("Add Traffic Lights");
        cityMenu.add(lights);

        JMenuItem load = new JMenuItem("Load file");
        file.add(load);
        JMenuItem save = new JMenuItem("Save file");
        file.add(save);

        JMenuItem straight = new JMenuItem("Straight Road");
        roads.add(straight);
        JMenuItem tSection = new JMenuItem("T-Intersection");
        roads.add(tSection);
        JMenuItem fourWay = new JMenuItem("4-way road");
        roads.add(fourWay);

        JMenuItem trafficLights = new JMenuItem("Traffic Lights");
        lights.add(trafficLights);

        load.addActionListener(this);
        save.addActionListener(this);
        straight.addActionListener(this);
        tSection.addActionListener(this);
        fourWay.addActionListener(this);
        trafficLights.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

    }
}
