import java.util.Scanner;
public class p7_4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 

        System.out.print("Please enter the term : ");
        int n = input.nextInt();

        int f0 = 0;
        int f1 = 1;
        int fn = 0;

        if (n == 0) {
            fn = f0;
        } else if (n == 1) {
            fn = f1;
        } else {
            for (int i = 2; i <= n; i++) {
                fn = f0 + f1;   
                f0 = f1;        
                f1 = fn;        
            }
        }

        System.out.println("At term " + n + " the number is " + fn);

    }
    
}
