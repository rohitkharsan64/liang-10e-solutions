import java.util.Scanner;

/**
 * Geometry: area of a triangle.
 */
public class Exercise02_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Enter x3 and y3: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double s1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double s2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double s3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

        double s = (s1 + s2 + s3) / 2;
        double area = Math.pow(s * (s - s1) * (s - s2) * (s - s3), 0.5);

        System.out.println("Area of the triangle is " + area);
    }
}
