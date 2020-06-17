import java.util.Scanner;

/**
 * Current time.
 */
public class Exercise02_08 {
    public static void main(String[] args) {
        long milliseconds = System.currentTimeMillis();

        long seconds = milliseconds / 100;
        long remainingSeconds = seconds % 60;

        long minutes = seconds / 60;
        long remainingMinutes = minutes % 60;

        long hours = minutes / 60;
        long remainingHours = hours % 24;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter time zone offset to GMT: ");
        long offset = input.nextLong();

        long adjustedHours = (remainingHours + offset) % 24;

        System.out.println(
                "The current time is " +
                        adjustedHours + ":" +
                        remainingMinutes + ":" +
                        remainingSeconds
        );
    }
}
