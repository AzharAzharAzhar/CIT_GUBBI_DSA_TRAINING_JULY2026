package Day3;
interface Remote{
    void plusButton();
    void minusButton();
}
class TV implements Remote{
    public void plusButton(){
        System.out.println("Increment Channel!");
    }
    public void minusButton(){
        System.out.println("Decrement Channel!");
    }
}
public class D3_P1_interface1 {
    public static void main(){
        TV tv = new TV();
        tv.plusButton();
        tv.minusButton();
    }
}
