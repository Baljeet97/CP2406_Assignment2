package Model;

import java.awt.*;

public class Road extends Shapes {
    private int height, width;
    private int x, y;
    private boolean isVertical;

    public Road(int x, int y, Color color, boolean isVertical) {
        super(x, y, color);
        this.x = x;
        this.y = y;
        this.isVertical = isVertical;
        straightRoad();
    }


    public void straightRoad() {
        if (!isVertical) {
            this.width = 200;
            this.height = 80;
        } else {
            this.width = 80;
            this.height = 200;
        }
    }

    public void setVertical(boolean vertical) {
        isVertical = vertical;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void update(int boundaryWidth, int boundaryHeight) {

    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(color);
        g.drawRect(x, y, width, height);

    }

}
