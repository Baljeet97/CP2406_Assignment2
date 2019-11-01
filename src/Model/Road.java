package Model;

import java.awt.*;

public class Road extends Shape {

    private Color color;
    private int height, width;
    private int x, y;
    private Boolean is_Vertical;

    public Road(int x, int y, boolean is_Vertical) {

        super(x, y);
        this.x = x;
        this.y = y;
        this.color = new Color(0, 4, 39);
        this.is_Vertical = is_Vertical;
        setDimensions();
    }

    private void setDimensions() // setting road length and width according to the orientation
    {
        if (!is_Vertical) {
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

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
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
