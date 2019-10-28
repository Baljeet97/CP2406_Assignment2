package Model;

import java.awt.*;

public abstract class Vehicle {
    int x, y;
    int xDir, yDir;

    Vehicle(int x, int y, int xDir, int yDir) {
        this.x = x;
        this.y = y;
        this.xDir = xDir;
        this.yDir = yDir;
    }

    public void move() {
        x += xDir;
        y += yDir;
    }

    public abstract void update(int width, int height);

    public abstract void paintComponent(Graphics g);
}

