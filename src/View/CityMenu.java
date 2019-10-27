package View;

import javax.swing.*;

class CityMenu extends JFrame {
    private JMenuItem exit = new JMenuItem("Exit");
    private JMenuItem road = new JMenuItem("Add Road");
    private JMenuItem city = new JMenuItem("City Edit Mode");

    CityMenu() {
        setTitle("City Edit Mode");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(900, 600);
        setVisible(true);
    }
}
