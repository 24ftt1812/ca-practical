import java.util.Scanner;
public class p9_2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D'},
            {'D', 'B', 'C', 'B', 'B', 'A'},
            {'C', 'B', 'A', 'B', 'B', 'A'},
            {'A', 'B', 'C', 'B', 'A', 'A'}
        };

        char[] keys = new char[6];

        System.out.println("Enter the key to the MCQ:");
        for (int i = 0; i < keys.length; i++) {
            keys[i] = input.next().toUpperCase().charAt(0);
        }

        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctCount++;
                }
            }

            String result = (correctCount >= 3) ? "passed" : "failed";

            System.out.println("Student " + i + "'s correct count is " + correctCount + 
                ". Therefore, he/she " + result + " the test.");
        }

        input.close();
    }
    
}
