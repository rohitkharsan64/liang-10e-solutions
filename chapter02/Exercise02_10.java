import java.util.Scanner;

/**
 * Science: calculating energy.
 */
public class Exercise02_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount of water in kilograms: ");
        double mass = input.nextDouble();

        System.out.print("Enter initial temperature: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter final temperature: ");
        double finalTemperature = input.nextDouble();

        double energyNeeded = mass * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy needed is " + energyNeeded);
    }
}
