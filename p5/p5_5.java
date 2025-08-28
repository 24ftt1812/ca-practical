import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
public class p5_5 {
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);

        System.out.print("Enter name:");
        String name = input.nextLine();

        String upperName = name.toUpperCase();

        File folder = new File("Practical 5");
        if (!folder.exists()) {
            folder.mkdir();
        }

        File file = new File(folder, "QReceipt.txt");
        
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dateTime = formatter.format(now);

        String welcomeMessage = "WELCOME, " + upperName;

        Random rand = new Random();
        int queueNumber = rand.nextInt(9000) + 1000;

        System.out.println("Receipt generated. Thank you.");
}
}