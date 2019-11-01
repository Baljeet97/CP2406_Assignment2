package Model;

import java.awt.*;
import java.util.Random;

public abstract class Vehicle {
    int x, y;
    private final static Random random = new Random();
    int xDir, yDir, ySpeed, xSpeed;

    Vehicle(int x, int y) {
        this.x = x;
        this.y = y;

        xDir = 0;
        yDir = 0;
        xSpeed += 5;
        ySpeed += 6;

    }

    static int randomSpeed() {
        return random.nextInt(10) + 1;
    }


    public void move() {
        x += xSpeed * xDir;
        y += xSpeed * yDir;
    }

    public abstract void update(int width, int height, TrafficLight.State state);

    public abstract void paintComponent(Graphics g);
}
