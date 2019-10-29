package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimMenu extends JFrame implements ActionListener {
    JButton start = new JButton("Start");
    JButton stop = new JButton("Stop");
    DrawPanel drawPanel = new DrawPanel();


    public SimMenu() {
        setTitle("Simulator");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(1000, 700);
        setVisible(true);
        setResizable(false);

        JPanel top = new JPanel();

        top.add(start);

        top.add(stop);
        add(top, BorderLayout.SOUTH);
        JPanel bottom = new JPanel();
        add(bottom);
        drawPanel.animate();

        //start.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == start) {
            //add(drawPanel);
            drawPanel.animate();
            System.out.println("Start");
        }
    }
}