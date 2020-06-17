import java.util.Scanner;

/**
 * Sum the digits in an integer.
 */
public class Exercise02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 999: ");
        int originalNumber = input.nextInt();

        int remainingNumber = originalNumber;

        int units = remainingNumber % 10;
        remainingNumber /= 10;

        int tens = remainingNumber % 10;
        remainingNumber /= 10;

        int hundreds = remainingNumber;

        int sum = hundreds + tens + units;

        System.out.println("The sum of digits in " + originalNumber + " is " + sum);
    }
}
