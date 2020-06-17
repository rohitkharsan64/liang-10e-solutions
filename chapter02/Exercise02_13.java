import java.util.Scanner;

/**
 * Financial application: compound value.
 */
public class Exercise02_13 {
    public static void main(String[] args) {
        final double MONTHLY_INTEREST_RATE = 0.05 / 12;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter monthly saving amount: ");
        double monthlySavings = input.nextDouble();

        double total = 0;

        total += monthlySavings;
        total *= 1 + MONTHLY_INTEREST_RATE;

        total += monthlySavings;
        total *= 1 + MONTHLY_INTEREST_RATE;

        total += monthlySavings;
        total *= 1 + MONTHLY_INTEREST_RATE;

        total += monthlySavings;
        total *= 1 + MONTHLY_INTEREST_RATE;

        total += monthlySavings;
        total *= 1 + MONTHLY_INTEREST_RATE;

        total += monthlySavings;
        total *= 1 + MONTHLY_INTEREST_RATE;

        System.out.println("After the sixth month, the account value is " + total);
    }
}
