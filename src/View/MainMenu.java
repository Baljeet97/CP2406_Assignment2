package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame implements ActionListener {
    private JMenuItem exit = new JMenuItem("Exit");
    private JMenuItem simulation = new JMenuItem("Start Simulator");
    private JMenuItem city = new JMenuItem("City Edit Mode");

    public MainMenu() {
        setTitle("Traffic Simulator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JMenuBar mainBar = new JMenuBar();
        setJMenuBar(mainBar);

        JMenu file = new JMenu("File");
        mainBar.add(file);

        JMenu mainSim = new JMenu("Simulator");
        mainBar.add(mainSim);

        JMenu mainCity = new JMenu("City");
        mainBar.add(mainCity);

        file.add(exit);
        mainSim.add(simulation);
        mainCity.add(city);
        JMenuItem loadCity = new JMenuItem("Load File");
        mainCity.add(loadCity);

        JLabel heading = new JLabel("Welcome to Traffic Simulator");
        add(heading);
        heading.setFont(new Font("Arial", Font.BOLD, 14));

        exit.addActionListener(this);
        simulation.addActionListener(this);
        city.addActionListener(this);

        setSize(500, 300);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == exit) {
            System.exit(0);
        } else if (source == simulation) {
            SimMenu simMenu = new SimMenu();
        } else if (source == city) {
            CityMenu cityMenu = new CityMenu();
        }
    }
}
