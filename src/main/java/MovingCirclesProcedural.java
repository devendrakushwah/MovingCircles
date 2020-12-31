import processing.core.PApplet;

public class MovingCirclesProcedural extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 30;
    public static final int heightOfBall1 = HEIGHT / 5;
    public static final int heightOfBall2 = HEIGHT * 2 / 5;
    public static final int heightOfBall3 = HEIGHT * 3 / 5;
    public static final int heightOfBall4 = HEIGHT * 4 / 5;
    public static final int speedOfBall1 = 1;
    public static final int speedOfBall2 = 2;
    public static final int speedOfBall3 = 3;
    public static final int speedOfBall4 = 4;
    private int xPosition1 = 0;
    private int xPosition2 = 0;
    private int xPosition3 = 0;
    private int xPosition4 = 0;


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
        drawCircle(xPosition1, heightOfBall1, DIAMETER);
        drawCircle(xPosition2, heightOfBall2, DIAMETER);
        drawCircle(xPosition3, heightOfBall3, DIAMETER);
        drawCircle(xPosition4, heightOfBall4, DIAMETER);
        xPosition1 = xPosition1 + speedOfBall1;
        xPosition2 = xPosition2 + speedOfBall2;
        xPosition3 = xPosition3 + speedOfBall3;
        xPosition4 = xPosition4 + speedOfBall4;
    }

    public void drawCircle(int xPosition, int yPosition, int diameter) {
        ellipse(xPosition, yPosition, diameter, diameter);
        stroke(random(0, 255), random(0, 255), random(0, 255));
        fill(random(0, 255), random(0, 255), random(0, 255));
    }
}
