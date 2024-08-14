import java.util.Scanner;

public class nestedloops {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();

        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();

        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();
        
        for(int i =1; i <= columns; i++){
            System.out.println();
            for (int j = 0; j < rows; j++) {
                System.out.print(symbol);
            }
        }

        scanner.close();
    }
}
