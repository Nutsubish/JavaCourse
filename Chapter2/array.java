public class array {
    
    public static void main(String[] args) {
        
        // String[] cars = {"Camaro","Corvette","Tesla","Mustang"};

        // cars[0] = "BMW";

        // System.out.println(cars[1]);

        String[] cars = new String[3];
        cars[0] = "BMW";
        cars[1] = "Mercedes";
        cars[2] = "Camaro";

        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i]);
            
        }
    }
}
