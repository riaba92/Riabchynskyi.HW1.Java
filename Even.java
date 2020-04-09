package HW1;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = reader.nextInt();
        reader.close();

        if ( number % 2 == 0 ) {
            System.out.println("true");
        } else {
            System.out.println("false");
        };
    }
}
