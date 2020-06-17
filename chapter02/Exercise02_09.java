import java.util.Scanner;

/**
 * Physics: acceleration.
 */
public class Exercise02_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0, v1, and t: ");
        double initialVelocity = input.nextDouble();
        double finalVelocity = input.nextDouble();
        double time = input.nextDouble();

        double averageAcceleration = (finalVelocity - initialVelocity) / time;

        System.out.println("The average acceleration is " + averageAcceleration);
    }
}
