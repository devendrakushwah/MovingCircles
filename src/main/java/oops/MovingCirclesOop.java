package oops;

import processing.core.PApplet;

public class MovingCirclesOop extends PApplet {

    private final int WIDTH = 720;
    private final int HEIGHT = 640;
    private final int DIAMETER = 30;

    Circle[] circles;


    public static void main(String[] args) {
        PApplet.main("oops.MovingCirclesOop", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();

        circles = new Circle[4];

        for (int i = 0; i < 4; i++) {
            circles[i] = new Circle(0, HEIGHT * (i + 1) / 5, i + 1, DIAMETER);
        }
    }

    @Override
    public void draw() {
        moveCircles();
        drawCircles();
    }

    public void drawCircles() {
        for (int i = 0; i < 4; i++) {
            circles[i].draw(this);
        }
    }

    public void moveCircles() {
        for (int i = 0; i < 4; i++) {
            circles[i].move();
        }
    }
}