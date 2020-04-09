package HW1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a 1st number: ");
        String first = reader.next();
        System.out.println("Enter a 2nd number: ");
        String second = reader.next();
        reader.close();

        System.out.println("Sum is equal: " + (Integer.parseInt(first) + Integer.parseInt(second)));
    }
}
