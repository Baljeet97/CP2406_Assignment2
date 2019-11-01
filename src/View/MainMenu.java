package View;

import Controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame implements ActionListener {
    private JMenuItem exit = new JMenuItem("Exit");
    JMenuItem about = new JMenuItem("About");
    private JMenuItem simulation = new JMenuItem("Simulator");
    private JMenuItem city = new JMenuItem("City Editing Mode");


    public MainMenu() {
        setTitle("Traffic Simulator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JMenuBar mainBar = new JMenuBar();
        setJMenuBar(mainBar);

        JMenu file = new JMenu("File");
        mainBar.add(file);

        JMenu mode = new JMenu("Mode");
        mainBar.add(mode);

        JMenu aboutMain = new JMenu("About");
        mainBar.add(aboutMain);


        aboutMain.add(about);

        mode.add(simulation);
        mode.add(city);



        JLabel heading = new JLabel("Welcome to Traffic Simulator");
        add(heading);
        heading.setFont(new Font("Arial", Font.BOLD, 14));

        exit.addActionListener(this);
        simulation.addActionListener(this);
        city.addActionListener(this);
        about.addActionListener(this);

        setSize(500, 300);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == exit) {
            System.exit(0);
        } else if (source == simulation) {
            Controller.simulationMenu();

        } else if (source == city) {
            new CityMenu();

        } else if (source == about) {
            JOptionPane.showMessageDialog(null, "ME");
        }

    }
}
