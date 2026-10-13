package Day2;
class atm{
    private int amount=1000;
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount += amount;
    }
}
public class P2_abst1 {
    public static void main(){
        atm p1 = new atm();
        System.out.print("\nAmount: "+p1.getAmount());
        p1.setAmount(2500);
        System.out.print("\nAmount after setter: "+p1.getAmount());
    }
}

