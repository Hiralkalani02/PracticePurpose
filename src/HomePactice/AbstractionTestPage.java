package HomePactice;

public class AbstractionTestPage {
    public static void main(String[] args) {
        LoginPage lp = new LoginPage();
        lp.header();
        lp.login("admin", "test123");
        lp.title();
        lp.logout();
    }
}

abstract class Pages {
    public abstract void header();

    public abstract void title();

    public void logout() {
        System.out.println("Non abstract method");

    }
}

class LoginPage extends Pages {
    public void header() {
        System.out.println("Login page header");
    }

    public void title() {
        System.out.println("Login page title");
    }

    public void login(String un, String pwd) {
        System.out.println("LP - login");
        System.out.println("login with " + un + " and " + pwd);
    }

}


