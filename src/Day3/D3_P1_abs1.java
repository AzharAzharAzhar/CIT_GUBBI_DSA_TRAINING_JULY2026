package Day3;

abstract class ems{
    public abstract void login();
    public abstract void logout();
    public void salary(){
        System.out.println("Salary Credited");
    }
}

class manager extends ems{
    public void login(){
        System.out.println("Login Successfull!");
    }
    public void logout(){
        System.out.println("Logout Successfull!");
    }
}

public class D3_P1_abs1 {
public static void main(){
        manager e = new manager();
        e.login();
    }
}
