import java.util.Scanner;
public class p4_5 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        // 1st package input
        System.out.print("Enter the price of the 1st package: $");
        double price1 = input.nextDouble();
        System.out.print("Enter the weight of the 1st package in gram: ");
        double weight1 = input.nextDouble();

        // 2nd package input
        System.out.print("Enter the price of the 2nd package: $");
        double price2 = input.nextDouble();
        System.out.print("Enter the weight of the 2nd package in gram: ");
        double weight2 = input.nextDouble();

        // Calculate value (weight per price)
        double value1 = weight1 / price1;
        double value2 = weight2 / price2;

        // Determine which package is worth more using ternary operator
        String result = (value1 > value2) ? "It is worth more to buy the 1st package"
                                         : "It is worth more to buy the 2nd package";

        // Display result
        System.out.println(result);
    }
}
