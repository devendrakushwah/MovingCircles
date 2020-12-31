import processing.core.PApplet;

public class MovingCirclesOop extends PApplet {

    ScreenSize screenSize = new ScreenSize(640, 480);
    Circle circle1, circle2, circle3, circle4;

    public static int heightOfCircle1;
    public static int heightOfCircle2;
    public static int heightOfCircle3;
    public static int heightOfCircle4;
    public static final int speedOfCircle1 = 1;
    public static final int speedOfCircle2 = 2;
    public static final int speedOfCircle3 = 3;
    public static final int speedOfCircle4 = 4;
    public static final int diameter = 30;

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

        heightOfCircle1 = screenSize.getHEIGHT()/5;
        heightOfCircle2 = screenSize.getHEIGHT() * 2 / 5;
        heightOfCircle3 = screenSize.getHEIGHT() * 3 / 5;
        heightOfCircle4 = screenSize.getHEIGHT() * 4 / 5;


        circle1 = new Circle(0, heightOfCircle1, diameter, speedOfCircle1, 0);
        circle2 = new Circle(0, heightOfCircle2, diameter, speedOfCircle2, 0);
        circle3 = new Circle(0, heightOfCircle3, diameter, speedOfCircle3, 0);
        circle4 = new Circle(0, heightOfCircle4, diameter, speedOfCircle4, 0);

    }

    @Override
    public void draw() {
        drawCircle(circle1);
        drawCircle(circle2);
        drawCircle(circle3);
        drawCircle(circle4);

        circle1.updateCenterCoordinates();
        circle2.updateCenterCoordinates();
        circle3.updateCenterCoordinates();
        circle4.updateCenterCoordinates();
    }

    void drawCircle(Circle circle){
        ellipse(circle.getxCenter(), circle.getyCenter(), circle.getDiameter(), circle.getDiameter());
        RandomColor randomColor = new RandomColor();
        fill(randomColor.getRed(), randomColor.getBlue(), randomColor.getGreen());
        stroke(randomColor.getRed(), randomColor.getBlue(), randomColor.getGreen());
    }
}

class ScreenSize{
    private int WIDTH;
    private int HEIGHT;

    public ScreenSize(int WIDTH, int HEIGHT) {
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }
}