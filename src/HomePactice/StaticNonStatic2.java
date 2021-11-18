package HomePactice;

public class StaticNonStatic2 {

    static int a = 10;
    double b = 0.01;

    void beautiful() {
        System.out.println("You are beautiful");
    }

    static void handsome() {
        System.out.println("You are handsome");
    }

    public static void main(String[] args) {
        System.out.println("I love everything");
        StaticNonStatic2 sn = new StaticNonStatic2();
        sn.beautiful();
        handsome();
        System.out.println(a);
        System.out.println(sn.b);

    }

}
