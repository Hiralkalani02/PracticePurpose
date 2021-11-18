package HomePactice;

public class StaticAndNonstatic {
    String name;
    static int salary;

    public void getName() {
        System.out.println("non static method");
    }

    public static void getSalary() {
        System.out.println("static method");
    }

    public static void main(String[] args) {
        salary = 2500;
        System.out.println(salary);
        //getName

        // call by class name
        StaticAndNonstatic.salary = 2500;
        System.out.println(StaticAndNonstatic.salary);
        //StaticAndNonstatic.getName();

        //to call non-static member create an object

        StaticAndNonstatic obj = new StaticAndNonstatic();
        obj.getName();
        obj.name = "tom";
        System.out.println(obj.name);

    }


}
