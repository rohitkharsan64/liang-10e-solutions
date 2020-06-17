import java.util.Scanner;

/**
 * Convert feet into meters.
 */
public class Exercise02_03 {
    public static void main(String[] args) {
        final double METERS_PER_FOOT = 0.305;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        double meters = feet * METERS_PER_FOOT;

        System.out.println(feet + " feet is " + meters + " meters");
    }
}
