import java.util.Scanner;

/**
 * Find the number of years.
 */
public class Exercise02_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();

        int totalDays = minutes / (60 * 24);
        int remainingDays = totalDays % 365;

        int years = totalDays / 365;

        System.out.println(minutes + " minutes is " + years + " years and " + remainingDays + " days");
    }
}
