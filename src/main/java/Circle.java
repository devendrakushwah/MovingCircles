public class Circle {
    private int xCenter, yCenter, diameter, xIncrement, yIncrement;

    public Circle(int xCenter, int yCenter, int diameter, int xIncrement, int yIncrement) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.diameter = diameter;
        this.xIncrement = xIncrement;
        this.yIncrement = yIncrement;
    }

    public int getxCenter() {
        return xCenter;
    }

    public int getyCenter() {
        return yCenter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void updateCenterCoordinates(){
        this.xCenter = this.xCenter + xIncrement;
        this.yCenter = this.yCenter + yIncrement;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
