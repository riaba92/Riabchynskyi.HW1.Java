package HW1;
import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a 1st number: ");
        int first = reader.nextInt();
        System.out.println("Enter a 2nd number: ");
        int second = reader.nextInt();
        System.out.println("Enter a 3rd number: ");
        int third = reader.nextInt();
        reader.close();

        if ( first >= second && first >= third ) {
            System.out.println("Maximum value is: " + first);
        } else if ( second >= first && second >= third ) {
            System.out.println("Maximum value is: " + second);
        } else {
            System.out.println("Maximum value is: " + third);
        };
    }
}

