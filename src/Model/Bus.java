package Model;

import java.awt.*;

public class Bus extends Vehicle {
    private Color color;
    private int x, y, xDir, yDir, length, width;
    private boolean isVertical;

    public Bus(int x, int y, int xDir, int yDir) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.width = 50;
        this.length = 20;
        this.xDir = xDir;
        this.yDir = yDir;
        this.color = new Color(240, 221, 17);
        this.isVertical = false;
    }

    public void setVertical(boolean vertical) {
        isVertical = vertical;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getxDir() {
        return this.xDir;
    }

    public void setxDir(int xDir) {
        this.xDir = xDir;
    }

    public int getyDir() {
        return this.yDir;
    }

    public void setyDir(int yDir) {
        this.yDir = yDir;
    }

    @Override
    public void move() {

    }

    @Override
    public void update() {
//        xDir = 1;
        if (x + length == 249) {
            yDir = 1;
            xDir = 0;
            isVertical = true;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(color);


        if (!isVertical)
            g.fillRect(x, y, length, width);
        else
            g.fillRect(x + length + 5, y, length, width);
    }
}
