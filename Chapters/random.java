package Chapters;
import java.util.Random;
import java.util.Scanner;

public class random {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.println("Enter number that you want to be maximum: ");
        int userinput = scanner.nextInt();
        scanner.nextLine();
        
        

        int x = random.nextInt(userinput)+1;

        System.out.println(x);
        scanner.close();
    }
    
}
