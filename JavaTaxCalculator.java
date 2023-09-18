import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        // Define tax rate (as a decimal)
        double taxRate = 0.2; // 20% tax rate

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their income
        System.out.print("Enter your annual income: $");
        double income = scanner.nextDouble();

        // Calculate the tax
        double tax = income * taxRate;

        // Display the calculated tax
        System.out.println("Your income tax is: $" + tax);
        scanner.close();
    }
}