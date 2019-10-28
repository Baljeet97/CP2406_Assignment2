package Model;

import java.awt.*;

public abstract class Shapes {
    int x, y;
    Color color;


    Shapes(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;

    }

    public abstract void update(int boundaryWidth, int boundaryHeight);

    public abstract void paintComponent(Graphics g);

}
