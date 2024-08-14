import java.util.Scanner;

public class wrapper {
    public static void main(String[] args) {
        
        
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Hello";

      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
      System.out.println(e);
    

        int rows;
        int columns;
        String symbol = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount of row");
        rows =  scanner.nextInt();

        System.out.println("Enter amount of columns");
        columns = scanner.nextInt();

        System.out.println("Enter Your Symbol:");
        symbol = scanner.next();

        for (int i = 0; i <= rows; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
        }

        scanner.close();    
    }
}   
