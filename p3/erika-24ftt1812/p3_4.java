import java.util.Scanner; //for input
public class p3_4 {
    public static void main(String[] args) {
        System.out.println("Each durian cost $15.65");
        double durian = 15.65; //price of each durian
        Scanner input = new Scanner(System.in);
        System.out.print("How much money do you have? :  ");
        double name= input.nextDouble();
        int sum = 0;
        if(name >= durian){ 
            sum = (int) (name / durian);

        }
        if (sum > 0) {
            System.out.println("The number of durian(s) you can buy " + sum);
        } else {
            System.out.println("The number of durian(s) you can buy " + sum);
        }
        

        //  Scanner input = new Scanner(System.in);
        //  System.out.print("enter your name ");
        //  // String name= input.nextLine();
        //  String name= input.next();
        //  System.out.println("Hi "+name);
        //  System.out.print("Enter year of birth: ");
        //  int yob = input.nextInt(); //int consider as variable
        //  System.out.println(name+ " was born in "+yob);
        //  int age = 2025-yob;
        //  System.out.println(name+ " will be "+(2025-yob)+" years old this year")
    }
    
}
