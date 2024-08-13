package Chapters;
import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        // Logical operators = used to connect two or more expressions
        //          && = (AND) Both Conditions Must Be True
        //          || = (OR) Either Condition Must Be True
        //          ! = (NOT) reverses boolean value of Condition

        // Examples

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Budget: ");
        int budget = scanner.nextInt();
        scanner.nextLine();

        if(budget > 0 && budget< 1000){
            System.out.print("Your Budget Is Too Low! ");
        }else if(budget > 1000 && budget < 2500){
            System.out.print("You Can Buy Medium PC With This Amount of Money");
        }else if(budget > 2500 || budget == 2500){
            System.out.print("You Can Buy This Special Offer PC");
        }else if(budget <= 0){
            System.out.print("Enter Valid Budget! ");
        }

        scanner.close();
    }
}
