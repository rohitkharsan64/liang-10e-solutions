import java.util.Scanner;

/**
 * Science: wind-chill temperature.
 */
public class Exercise02_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit (between -58 F and 41 F): ");
        double temperature = input.nextDouble();

        System.out.print("Enter wind speed in miles per hour (greater than 2): ");
        double windSpeed = input.nextDouble();

        double windChillIndex = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) +
                0.4275 * temperature * Math.pow(windSpeed, 0.16);

        System.out.println("The wind chill index is " + windChillIndex);
    }
}
