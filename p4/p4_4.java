import java.util.Scanner;
public class p4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for conversion choice
        System.out.print("Enter 1 to convert BND to RM and 2 vise versa: ");
        int choice = input.nextInt();

        // Ask user for amount
        System.out.print("Enter the amount to be converted: $");
        double amount = input.nextDouble();

        // Convert using ternary operator
        double converted = (choice == 1) ? (amount * 3) : (amount / 3);

        // Display result formatted to 2 decimal points
        System.out.printf("The change is $%.2f\n", converted);
    }
}
