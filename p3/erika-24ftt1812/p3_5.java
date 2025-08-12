import java.util.Scanner; //for input
public class p3_5 {
    public static void main(String[] args) {
    int month = 30;
    System.out.println(" What is your target amount? ");
    Scanner input = new Scanner(System.in);
    double name = input.nextDouble();
    System.out.println(" How many month(s) to reach your goal? ");
    int days = input.nextInt();
    int months = days * month;
    double sum = name / months;
    System.out.printf(" The amount you need to save per day %.2f", sum); //%.2f means round off to 2 decimal place


     
    

    }
}
