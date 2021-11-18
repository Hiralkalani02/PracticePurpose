package MethodOverriding;

public class Bike extends Vehicles {
    @Override
    public void numberOfVehicles() {
        super.numberOfVehicles();
        System.out.println("Bike...2 wheels");
    }
}
