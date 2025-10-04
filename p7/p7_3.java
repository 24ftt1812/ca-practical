import java.util.Scanner;
public class p7_3 {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in); 

  int number;              
        int positiveCount = 0;   
        int negativeCount = 0;   
        int total = 0;           
        int count = 0;           
        double average;          

        System.out.println("Enter an integer, the input ends if it is 0:");

        while (true) {   
            number = input.nextInt();

            if (number == 0) {   
                break;
            }
            if (number > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }

            total += number;
            count++;           
        }

        if (count == 0) {  
            System.out.println("No number is entered except for 0 to end the program.");
        } else {
            average = (double) total / count;

            System.out.println("The number of positive is " + positiveCount);
            System.out.println("The number of negatives is " + negativeCount);
            System.out.println("The total is " + total);
            System.out.printf("The average is %.2f\n", average);
        }

 }   
}
