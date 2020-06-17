import java.util.Scanner;

/**
 * Population projection.
 */
public class Exercise02_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        int population = (int) (312032486 + years * (365 * 24 * 3600) * (1.0 / 7 - 1.0 / 13 + 1.0 / 45));

        System.out.println("Population after " + years + " years will be " + population);
    }
}
