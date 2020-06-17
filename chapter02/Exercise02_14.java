import java.util.Scanner;

/**
 * Health application: computing BMI.
 */
public class Exercise02_14 {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = input.nextDouble();

        double kilograms = pounds * KILOGRAMS_PER_POUND;
        double meters = inches * METERS_PER_INCH;

        double bmi = kilograms / (meters * meters);

        System.out.println("BMI is " + bmi);
    }
}
