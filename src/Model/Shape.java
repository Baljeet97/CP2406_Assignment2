package Model;

import java.awt.*;

public abstract class Shape {
    int x, y;

    Shape(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public abstract void update(int boundaryWidth, int boundaryHeight, TrafficLight.State state);

    public abstract void paintComponent(Graphics g);
}
