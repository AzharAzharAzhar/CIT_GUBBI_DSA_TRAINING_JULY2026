package Day5;

public class D5_P4_SWA_FS1 {
    public static void main() {
        int[] a = {10, 23, 8, 4, 7, 6, 5, 4};
        int k = 3;
        int n = a.length;
        int Sum = 0;
        for (int i = 0; i < k; i++) {
            Sum += a[i];
        }
        System.out.print(Sum + " ");
        for(int i=1; i<(n-k); i++){
            Sum = Sum - a[i-1]+ a[i-1+k];
            System.out.print(Sum + " ");
        }System.out.print("\n");
    }
}
