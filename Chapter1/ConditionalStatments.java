
import java.util.Scanner;

public class ConditionalStatments {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter You're Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();        

        if(age > 18){
            System.out.println("You Older Than 18  ");
        }else if(age == 18){
            System.out.println("You Are 18 Years old");
        }
        else if(age < 0){
            System.out.println("Bro You Are not born");
        }
        else{
            System.out.println("You Are Younger than 18 ");
        }
        

        
        scanner.close();
    }
}
