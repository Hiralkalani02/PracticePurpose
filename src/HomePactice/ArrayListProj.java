package HomePactice;

import java.util.ArrayList;

public class ArrayListProj {

    public static void main(String[] args) {
        //Example of array
        String[] fruits = new String[4];
        fruits[0] = "Mango";
        fruits[1] = "Banana";
        fruits[2] = "Grapes";
        fruits[3] = "Cherry";

        System.out.println(fruits[2]);

        ArrayList fruitList = new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Watermelon");
        fruitList.add("Banana");

        fruitList.remove("Mango");
        //fruitList.clear();

        System.out.println(fruitList);


    }
}