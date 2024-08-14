import java.util.ArrayList;

public class arrayLists {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        
        cars.add("Corvette");
        cars.add("BMW");
        cars.add("Toyota");
        
        cars.set(0, "Mercedes");
        cars.remove(0);
        // cars.clear();
        cars.add("Sigma");
        for (int index = 0; index < cars.size(); index++) {
            System.out.println(cars.get(index));
        }
 
    }
}