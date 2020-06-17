import java.util.Scanner;

/**
 * Convert pounds into kilograms.
 */
public class Exercise02_04 {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.454;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter pounds: ");
        double pounds = input.nextDouble();

        double kilograms = pounds * KILOGRAMS_PER_POUND;

        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
