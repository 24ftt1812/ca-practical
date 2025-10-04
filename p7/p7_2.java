import java.util.Scanner;
public class p7_2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        int rounds = 0;          
        int userScore = 0;       
        int computerScore = 0;   
        int userChoice, compChoice;
        String playAgain;        

        do {
           
            compChoice = (int)(Math.random() * 3);
            
            System.out.print("Enter rock (0), paper (1), scissor (2): ");
            userChoice = input.nextInt();

            String[] names = {"rock", "paper", "scissor"};
            System.out.println("The computer is " + names[compChoice] + ". You are " + names[userChoice] + ".");
           
            if (userChoice == compChoice) {
                System.out.println("It is a draw.");
            } else if ((userChoice == 0 && compChoice == 2) || 
                       (userChoice == 1 && compChoice == 0) || 
                       (userChoice == 2 && compChoice == 1)) {
                System.out.println("You win.");
                userScore++;
            } else {
                System.out.println("You lose.");
                computerScore++;
            }

            rounds++; 

            System.out.print("Enter y to play again: ");
            playAgain = input.next();

        } while (playAgain.equalsIgnoreCase("y"));
        
        System.out.println("\nIn the total of " + rounds + " round(s), You scored " + userScore + ", Computer scored " + computerScore);

        if (userScore > computerScore) {
            System.out.println("You won the game.");
        } else if (userScore < computerScore) {
            System.out.println("You lose the game.");
        } else {
            System.out.println("It is a draw game.");
        }

    }
}
