import java.util.Scanner;

/**
 * Cost of driving.
 */
public class Exercise02_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter driving distance: ");
        double distance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        double cost = distance / milesPerGallon * pricePerGallon;

        System.out.println("The cost of driving is " + cost);
    }
}
