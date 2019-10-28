package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimMenu extends JFrame implements ActionListener {
    JButton start = new JButton("Start");
    JButton stop = new JButton("Stop");

    DrawPanel drawPanel = new DrawPanel();


    SimMenu() {
        setTitle("Simulator");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(900, 600);
        setVisible(true);

        JPanel top = new JPanel();

        top.add(start);

        top.add(stop);
        add(top, BorderLayout.SOUTH);
        JPanel bottom = new JPanel();
        add(bottom);

        start.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == start) {

            start.addActionListener(actionEvent -> drawPanel.animate());
        }
    }
}