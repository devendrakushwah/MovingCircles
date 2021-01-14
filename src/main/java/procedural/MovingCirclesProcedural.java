package procedural;

import processing.core.PApplet;

public class MovingCirclesProcedural extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 30;

    public int[] height;
    public int[] position;


    public static void main(String[] args) {
        PApplet.main("procedural.MovingCirclesProcedural", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();

        height = new int[4];
        position = new int[4];

        for (int i = 0; i < 4; i++) {
            height[i] = HEIGHT * (i + 1) / 5;
            position[i] = 0;
        }

    }

    @Override
    public void draw() {
        moveCircles();
        drawCircles();
    }

    public void drawCircles() {
        for (int i = 0; i < 4; i++) {
            ellipse(position[i], height[i], DIAMETER, DIAMETER);
        }
    }

    public void moveCircles() {
        for (int i = 0; i < 4; i++) {
            position[i] += i + 1;
        }
    }
}
