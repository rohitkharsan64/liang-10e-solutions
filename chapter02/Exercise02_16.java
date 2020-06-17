import java.util.Scanner;

/**
 * Geometry: area of a hexagon.
 */
public class Exercise02_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side of hexagon: ");
        double side = input.nextDouble();

        double area = 3 * Math.pow(3, 0.5) * Math.pow(side, 2) / 2;

        System.out.println("The area of the hexagon is " + area);
    }
}
