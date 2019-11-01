package Model;

import java.awt.*;

public class Car extends Vehicle {
    // Declare variables
    private int x, y, xDir, yDir, width, height;
    private Color color;
    private Boolean is_Vertical;

    public Car(int x, int y, int xDir, int yDir) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.height = 20;
        this.width = 40;
        this.xDir = xDir;
        this.yDir = yDir;
        this.color = new Color(117, 0, 176);
        this.is_Vertical = true;
    }

    @Override
    public void move() {
        x += xDir;
        y += yDir;
    }


    @Override
    public void update(int trafficLightXPos, int trafficLightYPos, TrafficLight.State state) {
        if ((x + width == trafficLightXPos && state == TrafficLight.State.STOP)) {
            xDir = 0;
        } else if ((state == TrafficLight.State.GO))
            xDir = 1;
        xSpeed = randomSpeed();

        if (x == 930) {
            yDir = -1;
            ySpeed = randomSpeed();
            xDir = 0;
            is_Vertical = false;
        }

    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(color);


        if (is_Vertical)
            g.fillRect(x, y, width, height);
        else
            g.fillRect(x - width + 5, y, height, width);
    }


}
