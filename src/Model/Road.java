package Model;

import java.awt.*;

public class Road extends Shape {

    private Color color;
    private int height, width;
    private int x, y;
    private Boolean isVertical;

    public Road(int x, int y, boolean isVertical) {

        super(x, y);
        this.x = x;
        this.y = y;
        this.color = new Color(0, 4, 39);
        this.isVertical = isVertical;
        roadDimensions();
    }

    private void roadDimensions() // setting road length and width according to the orientation
    {
        if (!isVertical) {
            this.width = 950;
            this.height = 100;
        } else {
            this.width = 100;
            this.height = 800;
        }
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Boolean getVertical() {
        return isVertical;
    }

    @Override
    public void update(int boundaryWidth, int boundaryHeight, TrafficLight.State state) {
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
