import java.util.Scanner;

public class forloop{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        

        for(int x = 0; x < number; x++){
            if(x % 2 == 0){
                System.out.println("This number " + x + " is even");
            }else if (x % 2 == 1){
                System.out.println("This number " + x + " is odd" );
            }
        }        
        scanner.close();
    }
}