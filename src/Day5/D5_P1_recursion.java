package Day5;
import java.util.Scanner;
public class D5_P1_recursion {
    public static int recMethod(int n){
        // Base condition
        if(n==1){
            return 1;
        }
        return n + recMethod(n-1);
    }
    public static void main(){
        System.out.println("Enter the value of N:");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Sum = recMethod(N);
        System.out.println("Sum of N Natiral no's: " +Sum);
    }

}
