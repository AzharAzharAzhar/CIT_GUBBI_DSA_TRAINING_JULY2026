package Day5;
import java.util.Scanner;
public class D5_P2_rec1 {
    public static int recMethod(int n, int rev){
        // Base condition
        if(n==0)
            return rev;
        rev = rev*10 + n%10;
        return recMethod(n/10, rev);
    }
    public static void main(){
        int rev =0;
        System.out.println("Enter the value of N:");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int reverse = recMethod(N, rev);
        System.out.println("Reverse of N: " +reverse);
    }
}
