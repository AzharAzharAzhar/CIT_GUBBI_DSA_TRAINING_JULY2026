package Day10;

public class D10_P2_FibDP {
    public static void main(){
        int n = 9;
        int[] dp = new int[n+1];
        System.out.println(fib(n, dp));
        for(int i:dp){
            System.out.print(i + " ");
        }System.out.println();
    }

    public static int fib(int n, int dp[]){
        if(n <= 1)
            return 1;

        if(dp[n] != 0)
            return dp[n];

       return dp[n] = fib(n-1, dp) + fib(n-2, dp);
    }
}
