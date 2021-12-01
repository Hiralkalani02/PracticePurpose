package HomePactice;

import java.util.ArrayList;

public class WrapperClass {
    //For every primitive type we have wrapper class
    public static void main(String[] args) {
        int a = 0;

        Integer aa = new Integer(a); //Boxing
        Integer bb = a; //Auto boxing

        int b = bb.intValue(); //Unboxing
        int c = bb; //AutoUnboxing

        //use of wrapper class
        ArrayList<Integer> values = new ArrayList<Integer>();
        values.add(5);
        values.add(7);

    }
}
