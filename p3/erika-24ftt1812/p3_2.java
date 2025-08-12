import java.util.Scanner;
public class p3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of byte(s) in to be converted: ");
        int a = input.nextInt();
         int pen_drive = a*8;
        System.out.println(a+" byte(s) is "+pen_drive + " bits "); 
    }
}
