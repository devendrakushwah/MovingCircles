import processing.core.PApplet;

public class MovingCirclesProcedural extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 30;
    public static final int yCenter1 = HEIGHT / 5;
    public static final int yCenter2 = HEIGHT * 2 / 5;
    public static final int yCenter3 = HEIGHT * 3 / 5;
    public static final int yCenter4 = HEIGHT * 4 / 5;
    public static final int speedOfBall1 = 1;
    public static final int speedOfBall2 = 2;
    public static final int speedOfBall3 = 3;
    public static final int speedOfBall4 = 4;
    private int xCenter1 = 0;
    private int xCenter2 = 0;
    private int xCenter3 = 0;
    private int xCenter4 = 0;


    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        background(0, 0, 0);
    }

    @Override
    public void draw() {
        drawCircle(xCenter1, yCenter1, DIAMETER);
        drawCircle(xCenter2, yCenter2, DIAMETER);
        drawCircle(xCenter3, yCenter3, DIAMETER);
        drawCircle(xCenter4, yCenter4, DIAMETER);
        xCenter1 = xCenter1 + speedOfBall1;
        xCenter2 = xCenter2 + speedOfBall2;
        xCenter3 = xCenter3 + speedOfBall3;
        xCenter4 = xCenter4 + speedOfBall4;
    }

    public void drawCircle(int xCenter, int yPosition, int diameter) {
        ellipse(xCenter, yPosition, diameter, diameter);
        stroke(random(0, 255), random(0, 255), random(0, 255));
        fill(random(0, 255), random(0, 255), random(0, 255));
    }
}
