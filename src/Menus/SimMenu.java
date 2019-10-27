package Menus;

import javax.swing.*;
import java.awt.*;

class SimMenu extends JFrame {

    SimMenu() {
        setTitle("Simulator");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(900, 600);
        setVisible(true);

        JPanel top = new JPanel();
        JButton start = new JButton("Start");
        top.add(start);

        JButton stop = new JButton("Stop");
        top.add(stop);
        add(top, BorderLayout.SOUTH);
        JPanel bottom = new JPanel();
        add(bottom);
    }
}