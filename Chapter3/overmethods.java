public class overmethods {

    public static void main(String[] args) {
        
        int x = add(1,1,2,3);
        int y = add(1, 2);
        System.out.println(y);
        System.out.println(x);
    }

    static int add(int a, int b){
        System.out.println("1 Method");
        return a+b;
    }

    static int add(int a, int b , int c){
        System.out.println("2 Method");
        return a+b+c;
    }
    
    static int add(int a, int b, int c, int d){
        System.out.println("3 Method");        
        return a+b+c+d;

    }


}
