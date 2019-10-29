package Model;

import java.awt.*;

public class Car extends Vehicle {
    private Color color;
    private int x, y, xDir, yDir, width, height;
    private boolean isVertical;

    public Car(int x, int y, int xDir, int yDir) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.height = 20;
        this.width = 40;
        this.xDir = xDir;
        this.yDir = yDir;
        this.color = new Color(102, 0, 153);
        this.isVertical = false;
    }

    public void setVertical(boolean vertical) {
        isVertical = vertical;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
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
        x += xSpeed * xDir;
        y += ySpeed * yDir;
    }

    @Override
    public void update() {
//        xDir = 1;
        if (x + width == 249) {
            yDir = 1;
            xDir = 0;
            isVertical = true;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(color);


        if (!isVertical)
            g.fillRect(x, y, width, height);
        else
            g.fillRect(x + width - 5, y, width, height);
    }
}
