package Model;

import java.awt.*;

public class Bus extends Vehicle {

    private int x, y, xDir, yDir, width, height;
    private Color color;
    private Boolean isVertical;

    public Bus(int x, int y, int xDir, int yDir) {

        super(x, y);
        this.x = x;
        this.y = y;
        this.height = 60;
        this.width = 20;
        this.xDir = xDir;
        this.yDir = yDir;
        this.color = new Color(240, 221, 17);
        this.isVertical = true;
    }

    @Override
    public void move() {
        y += yDir;
    }

    @Override
    public void update(int trafficLightXPos, int trafficLightYPos, TrafficLight.State state) {
        if ((y + height - 100 == trafficLightXPos && state == TrafficLight.State.STOP)) {
            yDir = 0;
            xDir = 1;
            xSpeed = 2 + randomSpeed();
        } else if ((state == TrafficLight.State.GO))
            yDir = 1;
        ySpeed = randomSpeed();
        if (y + width == 380) {
            yDir = 0;
            x -= xDir;
            xSpeed = randomSpeed();
            isVertical = false;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(color);
        if (isVertical)
            g.fillRect(x, y, width, height);
        else
            //to turn the car left or right that why width is in place height and height is in place of width
            g.fillRect(x - width + 5, y, height, width);
    }

    public int getyDir() {
        return yDir;
    }

    public int getxDir() {
        return xDir;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}


