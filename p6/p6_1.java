import java.util.Scanner;
public class p6_1 {
public static void main(String[] args) {
Scanner input = new Scanner (System.in);

    System.out.println("Enter rock (0), paper (1), scissor (2)");
    int user = input.nextInt();

    int randomNo = (int) (Math.random() * 1000000); 
    int computer = randomNo % 3; 
        
    String computerChoice = "";
        if (computer == 0) computerChoice = "rock";

     else if (computer == 1) computerChoice = "paper";

     else if (computer == 2) computerChoice = "scissor";

    String userChoice = "";
        if (user == 0) userChoice = "rock";

    else if (user == 1) userChoice = "paper";

    else if (user == 2) userChoice = "scissor";

    System.out.print("The computer is " + computerChoice + ". You are " + userChoice + ". ");

        if (computer == user)
            System.out.println("It is a draw.");

        else if (user == 0 && computer == 2)
            System.out.println("You Win.");

        else if (user == 0 && computer == 1)
            System.out.println("You Lose.");

        else if (user == 1 && computer == 0)
            System.out.println("You Win.");

        else if (user == 1 && computer == 2)
            System.out.println("You Lose.");

        else if (user == 2 && computer == 1)
            System.out.println("You Win.");

        if (user == 2 && computer == 0)
            System.out.println("You Lose.");
    }
}
