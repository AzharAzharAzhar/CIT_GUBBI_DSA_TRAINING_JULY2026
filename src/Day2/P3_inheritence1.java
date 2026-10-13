package Day2;

class P{
    public String species = "Humans";
    public void sleep(){
        System.out.println("Sleep!");
    }
    public void eat(){
        System.out.println("Eat!");
    }
    public void Job(){
        System.out.println("We work for money!");
    }
}
class D extends P{
    void jobRole(){
        System.out.println("We are " + super.species);
        System.out.println("Treat the people");
    }
}

public class P3_inheritence1 {
    static void main(){
        D d1 = new D();
        d1.jobRole();
    }
}




