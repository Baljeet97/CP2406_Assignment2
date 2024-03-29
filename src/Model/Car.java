package Model;

import java.awt.*;

public class Car extends Vehicle {

    private int x, y, xDir, yDir, width, height;
    private Color color;
    private Boolean isVertical;

    public Car(int x, int y, int xDir, int yDir) {

        super(x, y);
        this.x = x;
        this.y = y;
        this.height = 20;
        this.width = 40;
        this.xDir = xDir;
        this.yDir = yDir;
        this.color = new Color(117, 0, 176);
        this.isVertical = true;
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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getyDir() {
        return yDir;
    }

    public int getxDir() {
        return xDir;
    }
}
