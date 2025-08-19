import java.util.Scanner;
public class p4_1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        // Generate two random whole numbers between 0 and 100
        int num1 = (int)(Math.random() * 101);
        int num2 = (int)(Math.random() * 101);

        // ===== SUM QUESTION =====
        System.out.println("What is " + num1 + " + " + num2 + " ?");
        int userSum = input.nextInt();
        int correctSum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + userSum + " is " + (userSum == correctSum));

        // ===== MODULUS QUESTION =====
        System.out.println("What is " + num1 + " % " + num2 + " ?");
        int userMod = input.nextInt();
        int correctMod = (num2 != 0) ? (num1 % num2) : 0; // avoid division by zero
        System.out.println(num1 + " % " + num2 + " = " + userMod + " is " + (userMod == correctMod));

    }
}