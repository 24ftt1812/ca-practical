import java.util.Scanner;
public class p4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer between 100 and 999: ");
        int number = input.nextInt();

        // Extract digits
        int digit1 = number % 10;          // last digit
        int digit2 = (number / 10) % 10;   // middle digit
        int digit3 = number / 100;         // first digit

        // Reverse by concatenation
        String reversed = "" + digit1 + digit2 + digit3;

        // Display result
        System.out.println("The reverse of " + number + " is " + reversed);

    }
}
