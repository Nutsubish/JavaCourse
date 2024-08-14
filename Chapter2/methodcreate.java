// import java.util.Scanner;

import java.util.Scanner;

public class methodcreate {
    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter first number:");
        // int number1 = scanner.nextInt();
        // scanner.nextLine();
        
        // System.out.print("Enter second number: ");
        // int number2 = scanner.nextInt();
        // scanner.nextLine();

        // hello(number1, number2);

        // scanner.close();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int x = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter number2: ");
        int y = scanner.nextInt();
        scanner.nextLine();

        int sum = add(x, y);

        System.out.println(sum);
        
        scanner.close();
    }

    static int add(int num1 , int num2){
        
        int sum = num1 + num2;

        return sum;
    }



    // static void hello(int num1, int num2){

    //     System.out.println(num1 + num2);

    // }


}
