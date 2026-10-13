package Shopping_Project;

public class shopping {
    private int walletBal;

    public int getWalletBal() {
        return walletBal;
    }
    public void addWalletBal(int walletBal) {
        this.walletBal += walletBal;
        System.out.println("Amount added and new balance is "+ this.walletBal);
    }
    void purchase(int amt){
        System.out.println("Purchase of "+ amt + "Successfully completed");
        this.walletBal -= amt;
        System.out.println("New balance is "+ this.walletBal);
    }
}
