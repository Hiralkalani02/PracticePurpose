package HomePactice;

//Example of Constructor parameters

public class Parameters {
    //constructors can also take parameters, which is used to initialised attributes
    int x;

    public Parameters(int y) {
        x = y;
    }

    public static void main(String[] args) {
        Parameters myObj = new Parameters(6);
        System.out.println(myObj.x);

    }
}
