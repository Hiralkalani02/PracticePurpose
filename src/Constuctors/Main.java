package Constuctors;

//create Main class
public class Main {
    int a; //create class attribute

    //create class constructor for the main class
    public Main() {
        a = 5; //set initial values for the class attribute
    }

    public static void main(String[] args) {
        Main myObj = new Main(); //create an object of class main that will call the constructor
        System.out.println(myObj.a);
    }


}
