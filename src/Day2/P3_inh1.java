package Day2;

class Persons{
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
class Doctor extends Persons{
    void jobRole(){
        System.out.println("We are " + super.species);
        System.out.println("Treat the people");
    }
}
public class P3_inh1 {
    public static void main(){
        Doctor d1 = new Doctor();
        d1.jobRole();
    }
}
