import java.util.Scanner;
public class p4_2 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter three coordinates for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Calculate lengths of the three sides
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        // Semi-perimeter
        double s = (side1 + side2 + side3) / 2;

        // Area using Heron’s formula
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        // Display result in 1 decimal place
        System.out.printf("The area of the triangle is %.1f\n", area);
    }
}
