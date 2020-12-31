import processing.core.PApplet;

import java.util.Scanner;

public class MovingCircles extends PApplet {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter choice\t1 for Procedural\t2 for OOP\t3 for Waves\t:");
        choice = scanner.nextInt();
        switch (choice){
            case 1:
                PApplet.main("MovingCirclesProcedural", args);
                break;
            case 2:
                PApplet.main("MovingCirclesOop", args);
                break;
            case 3:
                PApplet.main("MovingCirclesWave", args);
                break;
            default:
                System.exit(0);
        }
    }
}
