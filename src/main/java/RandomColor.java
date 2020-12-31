import java.util.Random;

public class RandomColor {
    public static final Random RANDOM = new Random();
    private int red, blue, green;

    public RandomColor() {
        this.red = RANDOM.nextInt(255);
        this.blue = RANDOM.nextInt(255);
        this.green = RANDOM.nextInt(255);
    }

    public RandomColor(int red, int blue, int green) {
        this.red = red;
        this.blue = blue;
        this.green = green;
    }

    public int getRed() {
        return red;
    }

    public int getBlue() {
        return blue;
    }

    public int getGreen() {
        return green;
    }
}
