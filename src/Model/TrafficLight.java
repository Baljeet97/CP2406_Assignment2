package Model;

import java.awt.*;
import java.util.Random;

public class TrafficLight extends Shape {

    private Color color;
    private int width, height;
    private State state;
    private double changeState;

    public TrafficLight(int x, int y) {

        super(x, y);
        state = State.STOP;
        changeState = 0.995;
        width = 20;
        height = 20;
        this.color = getColor();
    }

    @Override
    public void update(int boundaryWidth, int boundaryHeight, TrafficLight.State state) {
    }

    @Override
    public void paintComponent(Graphics g) {

        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

    public void setState() {

        Random random = new Random();
        double nextDouble = random.nextDouble(); // Generates a random double to change the state of traffic light

        switch (state) {
            case GO:
                if (nextDouble >= this.changeState) {
                    state = State.STOP;
                    color = Color.red;
                }
                break;
            case STOP:
                if (nextDouble >= this.changeState) {
                    state = State.GO;
                    color = Color.green;
                }
                break;
        }
    }

    public int getPositionX() {
        return this.x;
    }

    public int getPositionY() {
        return this.y;
    }

    public State getState() {
        return this.state;
    }

    public Color getColor() {

        if (state.equals(State.GO))
            return Color.green;
        else
            return Color.red;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public enum State {
        //Using enums to determine the state
        STOP, GO
    }
}

