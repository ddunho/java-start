package overloading;

public class Overloading2 {

    public static void main(String[] args) {

    }

    public static void myMethod(int a, double b){
        System.out.println("int a, double b");
    }

    public static void myMethod(double a, int b){
        System.out.println("int a, double b");
    }
}
