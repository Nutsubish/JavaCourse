package Chapters;
import java.util.Scanner;

public class switches {
    
    public static void main(String[] args) {
        
        // switch = statement that allows a variable to be tested for equality against a list of value

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Week Day!");
        String day = scanner.nextLine();

        switch (day) {
            case "Friday": System.out.println("It is Friday!");
            break;
            case "Monday": System.out.println("It is Monday!");
            break;
            case "Tuesday": System.out.println("It is Tuesday!");
            break;
            case "Wednesday": System.out.println("It is Wednesday!");
            break;
            case "Thursday": System.out.println("It is Thursday!");
            break;
            case "Saturday": System.out.println("It is Saturday!");
            break;
            default: System.out.println("Enter a Valid Week Day! ");
        }
        scanner.close();

    }
}

