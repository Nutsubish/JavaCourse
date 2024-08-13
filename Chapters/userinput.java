package Chapters;

import java.util.Scanner;


public class userinput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is Your Name? ");
        String name = scanner.nextLine();

        System.out.println("How Old Are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is Your Favorite Food? ");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " old");
        System.out.println(("You Like " + food));
        
        System.out.println(scanner);
    }
}
