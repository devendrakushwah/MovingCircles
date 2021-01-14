package oops;

import processing.core.PApplet;

public class Circle {
    private int position, height, speed, diameter;

    public Circle(int position, int height, int speed, int diameter) {
        this.position = position;
        this.height = height;
        this.speed = speed;
        this.diameter = diameter;
    }

    public void draw(PApplet pApplet) {
        pApplet.ellipse(position, height, diameter, diameter);
    }

    public void move() {
        position += speed;
    }
}
