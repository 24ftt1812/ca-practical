import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;
public class p5_4 {
    public static void main(String[] args) {
      
        Random random = new Random();
        int num1 = random.nextInt(100); 
        int num2 = random.nextInt(99) + 1; 

        File folder = new File("p5_4");
        if (!folder.exists()) {
            folder.mkdir();
        }

        File file = new File(folder, "Modulus Questions.txt");

        System.out.println("A new question added");
    }
}
