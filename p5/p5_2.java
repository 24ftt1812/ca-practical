import java.util.Scanner;
public class p5_2 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);    
           // Ask user for a word
        System.out.print("Enter the 5 letters word: ");
        String word = input.nextLine();

        // Reverse using charAt()
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        // Output
        System.out.println("The reverse of the word " + word + " is " + reverse);

        input.close();

    }
}
    
