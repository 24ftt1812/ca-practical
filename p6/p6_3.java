import java.text.SimpleDateFormat;
import java.util.Scanner;
public class p6_3 {
public static void main(String[] args) {
Scanner input = new Scanner (System.in);   

        String correctUsername = "Ahmad Ali";
        String correctPassword = "12345";

        System.out.print("Please enter your username: ");
        String username = input.nextLine();

        System.out.print("Please enter the password: ");
        String password = input.nextLine();

        if (username.equals(correctUsername)) {
        
            if (password.equals(correctPassword)) {
                
                Date now = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String time = sdf.format(now);

                System.out.println("Welcome " + username + ". The time now is " + time);
            } else {                
                System.out.println("Error: Password does not match.");
            }
        } else {
            System.out.println("Error: Invalid Username.");
        }


}    
}
