import java.util.Scanner;

/**
 * Financial application: monetary units.
 */
public class Exercise02_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount in cents: ");
        int amount = input.nextInt();
        int remainingAmount = amount;

        int dollars = remainingAmount / 100;
        remainingAmount %= 100;

        int quarters = remainingAmount / 25;
        remainingAmount %= 25;

        int dimes = remainingAmount / 10;
        remainingAmount %= 10;

        int nickels = remainingAmount / 5;
        remainingAmount %= 5;

        int pennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");
        System.out.println("        " + dollars + " dollars");
        System.out.println("        " + quarters + " quarters");
        System.out.println("        " + dimes + " dimes");
        System.out.println("        " + nickels + " nickels");
        System.out.println("        " + pennies + " pennies");
    }
}
