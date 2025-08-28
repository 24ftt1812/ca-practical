import java.util.Scanner;
public class p5_3 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);  
       System.out.print("Enter your message ");
       String message = input.nextLine();

       System.out.print("Enter the substring to replace ");
       String subtrtingReplace = input.nextLine();

       System.out.print("Enter the replacement string ");
       String replacement = input.nextLine();

       String newMessage = message.replace(subtrtingReplace, replacement);

       System.out.print("Enter update message " +newMessage);
 


    }
    
}
