import java.util.Arrays;
import java.util.Scanner;
public class p8_5 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);   

    int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    numbers[j] = 0; 
                }
            }
        }

        Arrays.sort(numbers);

        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        input.close();
        
    }
    
}
