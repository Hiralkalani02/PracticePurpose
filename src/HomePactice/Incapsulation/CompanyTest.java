package HomePactice.Incapsulation;

public class CompanyTest {
    public static void main(String[] args) {
        CompanyName obj = new CompanyName();
        obj.setName("IBM");
        obj.setBudget(10000);
        obj.setProjects("Robotics");
        obj.setTotalEmp(5000);

        //With the help of all set methods I am trying to fill in the values. (setter)
        //With the help of get methods I can access them.(Getter)

        System.out.println(obj.getName());
        System.out.println(obj.getBudget());
        System.out.println(obj.getProjects());
        System.out.println(obj.getTotalEmp());

    }
}
