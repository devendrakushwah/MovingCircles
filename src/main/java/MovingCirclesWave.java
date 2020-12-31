import processing.core.PApplet;

public class MovingCirclesWave extends PApplet {

    ScreenSize screenSize = new ScreenSize(1280, 720);
    Circle circle1, circle2, circle3, circle4;

    int x = 0;
    int y;

    public static int yCenter1;
    public static int yCenter2;
    public static int yCenter3;
    public static int yCenter4;
    public static final int speedOfCircle1 = 1;
    public static final int speedOfCircle2 = 1;
    public static final int speedOfCircle3 = 1;
    public static final int speedOfCircle4 = 1;
    public static final int diameter = 20;

    @Override
    public void settings() {
        super.settings();
        size(screenSize.getWIDTH(), screenSize.getHEIGHT());
    }

    @Override
    public void setup() {
        super.setup();
        RandomColor bgColor = new RandomColor(0, 0, 0);
        background(bgColor.getRed(), bgColor.getBlue(), bgColor.getGreen());

        yCenter1 = screenSize.getHEIGHT() / 5;
        yCenter2 = screenSize.getHEIGHT() * 2 / 5;
        yCenter3 = screenSize.getHEIGHT() * 3 / 5;
        yCenter4 = screenSize.getHEIGHT() * 4 / 5;

        circle1 = new Circle(0, yCenter1, diameter, speedOfCircle1, 0);
        circle2 = new Circle(0, yCenter2, diameter, speedOfCircle2, 0);
        circle3 = new Circle(0, yCenter3, diameter, speedOfCircle3, 0);
        circle4 = new Circle(0, yCenter4, diameter, speedOfCircle4, 0);
    }

    @Override
    public void draw() {
        drawCircle(circle1);
        drawCircle(circle2);
        drawCircle(circle3);
        drawCircle(circle4);
        x = x + 1;
        y = (int) ((Math.sin(x * Math.PI / 180)) * 100);
        System.out.println(y);
        circle1.updateCenterCoordinates(x, yCenter1 + y);
        circle2.updateCenterCoordinates(x, yCenter2 + y);
        circle3.updateCenterCoordinates(x, yCenter3 + y);
        circle4.updateCenterCoordinates(x, yCenter4 + y);
    }

    void drawCircle(Circle circle) {
        ellipse(circle.getxCenter(), circle.getyCenter(), circle.getDiameter(), circle.getDiameter());
        RandomColor randomColor = new RandomColor();
        fill(randomColor.getRed(), randomColor.getBlue(), randomColor.getGreen());
        stroke(randomColor.getRed(), randomColor.getBlue(), randomColor.getGreen());
    }
}