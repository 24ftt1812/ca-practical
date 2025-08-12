import java.util.Scanner;

public class p3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a character: "); 
        String inputLine = scanner.nextLine(); 
        if (inputLine.length() > 0) { 
            char firstChar = inputLine.charAt(0); 
            int asciiValue = (int) firstChar; 

            System.out.println("The ASCII/Unicode value of '" + firstChar + "' is: " + asciiValue);
        } else {
            System.out.println("No character was entered.");
        }
    }
}