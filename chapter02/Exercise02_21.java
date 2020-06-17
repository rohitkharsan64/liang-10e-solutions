import java.util.Scanner;

/**
 * Financial application: calculate future investment value.
 */
public class Exercise02_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        double years = input.nextDouble();

        double monthlyInvestmentRate = annualInterestRate / 1200;

        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInvestmentRate, years * 12);

        System.out.println("Accumulated value is " + futureInvestmentValue);
    }
}
