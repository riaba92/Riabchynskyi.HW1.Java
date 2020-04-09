package HW1;

import java.util.Scanner;
import java.lang.Math;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter first side:");
        int a = reader.nextInt();
        System.out.println("Please enter second side:");
        int b = reader.nextInt();
        System.out.println("Please enter the angle between these sides:");
        int angle = reader.nextInt();
        reader.close();

        double radians = Math.toRadians(angle);
        System.out.println("The square of parallelogram is: " + (a * b * Math.sin(radians)));
    }

}
