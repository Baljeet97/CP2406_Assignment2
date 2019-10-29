package Model;

import java.awt.*;

public abstract class Vehicle {
    int x, y;
    int xDir, yDir;
    int xSpeed, ySpeed;

    Vehicle(int x, int y) {
        this.x = x;
        this.y = y;

        xDir = 0;
        yDir = 0;

    }

    public void move() {
        x += xDir;
        y += yDir;
    }

    public abstract void update();

    public abstract void paintComponent(Graphics g);
}

