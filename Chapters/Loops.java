package Chapters;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.print("Enter Your Name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);




        // System.out.print("Enter Steps From Shop");
        // int amount = scanner.nextInt();
        // scanner.nextLine();

        // while (amount > 0) {
        //     amount -= 1;
        //     System.out.println("Steps Left: " + amount);
        // }

        scanner.close();
    }
}
