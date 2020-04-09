package HW1;

import java.util.Scanner;
import java.lang.Math;

public class Triangle {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a:");
        int a = reader.nextInt();
        System.out.println("Please enter b:");
        int b = reader.nextInt();
        System.out.println("Please enter c:");
        int c = reader.nextInt();

        double p = ( a + b + c ) / 2;
        double square = Math.sqrt( p * ( p -a ) * ( p - b ) * ( p - c ) );

        System.out.println(" The square of triangle is: " + square);
    }
}


