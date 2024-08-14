
// Hypatinuoze Math

import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        
        double x;
        double y;
        double z;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ener side x: ");
        x = scanner.nextDouble();

        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));

        System.out.println("The Hypatinouze is: "+ z);
        
        scanner.close();
    }   
}
