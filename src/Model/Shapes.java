package Model;

import java.awt.*;

public abstract class Shapes {
    int x, y;
    Color color;


    Shapes(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public abstract void update(int boundaryWidth, int boundaryHeight);

    public abstract void paintComponent(Graphics g);

}
