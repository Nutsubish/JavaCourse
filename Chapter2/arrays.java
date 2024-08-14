public class arrays {
    public static void main(String[] args) {

        String [][] cars = {
                            {"Camaro","Corvete","Silverado"},
                            {"Mustang","Bmw","Mercedes"},
                            {"Opel","Lada","SUV"}
                        };

        // cars[0][0] = "Camero";
        // cars[0][1] = "Corvette";
        // cars[0][2] = "Silverado";
        // cars[1][0] = "Bmw";
        // cars[1][1] = "Mustang";
        // cars[1][2] = "Mercedes";
        // cars[2][0] = "Opel";
        // cars[2][1] = "Lada";
        // cars[2][2] = "SUV";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");

                
            }
        }
        
    }  

}
