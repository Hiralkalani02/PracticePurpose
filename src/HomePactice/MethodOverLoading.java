package HomePactice;

//In method overloading multiple methods can have same names with different parameters
public class MethodOverLoading {
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNumber1 = plusMethodInt(8, 5);
        double myNumber2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNumber1);
        System.out.println("double: " + myNumber2);
    }
}
