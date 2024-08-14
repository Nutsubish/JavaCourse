import java.util.*;

public class arraysLists {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<String>> shops = new ArrayList<>();


        ArrayList<String> carShop = new ArrayList<>();
        carShop.add("BMW");
        carShop.add("Mercedes");
        carShop.add("Corvete");

        // System.out.println(carShop);

        ArrayList<String> foodShop = new ArrayList<>();
        foodShop.add("Donut");
        foodShop.add("Biscuit");
        foodShop.add("Pizza");
        // System.out.println(foodShop.get(0));

        ArrayList<String> drinkShop = new ArrayList<>();
        drinkShop.add("coke");
        drinkShop.add("water");
        drinkShop.add("fanta");

        shops.add(drinkShop);
        shops.add(foodShop);
        shops.add(carShop);
        System.out.println(shops);
        // System.out.println(drinkShop);



    }
}
