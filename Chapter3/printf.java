public class printf {
    public static void main(String[] args) {


        

        boolean myBool = true; // %b
        char myChar = '#'; // %c
        String myString = "Bro"; // %s
        int myInt = 50; // %d
        double myDouble = 1000; // %f

        // [conversion-character] - where ever you put your %[character] - it appears on that position
        System.out.printf("Hel %b lo",myBool); // output: Hel true lo
        System.out.println(); // for new lines

        System.out.printf("N %c ger",myChar); // output : N # ger
        System.out.println(); // for new lines

        System.out.printf("Hi %s",myString); // output : Hi Bro
        System.out.println(); // for new lines

        System.out.printf("%d black people",myInt); // output : 50 Black people
        System.out.println(); // for new lines

        System.out.printf("%f years old", myDouble); // output : 50 Black people
        System.out.println();

        // [width]

        // 10 here is for 10 spaces beetwen "Hello" and our variable.       10 spaces
        System.out.printf("Hello %10s", myString); // output : Hello           Bro
        System.out.println();
        // - : left justify,                                                            10 spaces
        // example : if printf("Hello %-10s ending", myString);  // output will be Hello Bro             ending
        // + : output a plus (+) or a minust (-) for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping seperator if numbers > 1000

        // [precision]

        // sets anumber of digits of precision when outputting floating-point values

        // .2 f-ის წინ ნიშნავს . - ნოლიანები ანუ 10.000 . შემდეგ რა ნოლიანებიც მოდის და 2 რაოდენობა ნოლიანების
        System.out.printf("You have this much money %.2f",myDouble);
        // + და - მეთოდებიც აქვთ, უბრალოდ . შეცვალე + ან -, ცადე
    }    
}
