package Model;

import java.awt.*;

public class Road extends Shapes {
    private int height, width;
    private int x, y;
    private boolean isVertical;

    public Road(int x, int y, boolean isVertical) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.color = new Color(0, 0, 88);
        this.isVertical = isVertical;
        roadDimensions();
    }


    public void roadDimensions() {
        if (!isVertical) {
            this.width = 800;
            this.height = 100;
        } else {
            this.width = 100;
            this.height = 800;
        }
    }


    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }


    @Override
    public void update(int boundaryWidth, int boundaryHeight) {

    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

}
