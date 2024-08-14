// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class foreach {
    public static void main(String[] args) {
        // String[] animals = {"cat","dog","bird"};

        // ArrayList<String> animals = new ArrayList<String>();

        // animals.add("cat");
        // animals.add("dog");
        // animals.add("rat");
        // animals.add("bird");

        // for(String i : animals){
        //     System.out.println(i);
        // }

        // String animal;

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter new animal");
        // animal = scanner.nextLine();

        // String[] animals = {"dogs","birds","cats",animal};

        // for(String i : animals){
        //     System.out.print(i+" ");
        // }

        // scanner.close();

        int amount;

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> animals = new ArrayList<String>();

        System.out.println("Enter amount of animals you want to enter: ");
        amount = scanner.nextInt();
        scanner.nextLine();

        while (animals.size() < amount) {
            System.out.println("Enter animal()");
            animals.add(scanner.nextLine());
        }
        System.out.println(animals);


        scanner.close();
    }
}
