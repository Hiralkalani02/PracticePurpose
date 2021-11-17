package InterfacePractice;

import java.sql.SQLOutput;

class DemoClass implements FirstInterface, SecondInterface {

    @Override
    public void myMethod() {
        System.out.println("Implementation...");

    }

    @Override
    public void myOtherMethod() {
        System.out.println("Implementation...");
    }
}
