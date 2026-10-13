package Day5;

public class D5_LC643_maximumAverage_Subarray {
    public static void main() {
        int[] a = {10, 23, 8, 4, 7, 6, 5, 4};
        System.out.println("max_Average: " + max_average(a, 3));
    }

    public static double max_average(int[] nums, int k){
        int n = nums.length; double maxAverage = 0;
        double Sum = 0;
        for (int i = 0; i < k; i++) {
            Sum += nums[i];
        }
        maxAverage = Sum/k;
        for(int i=1; i<(n-k); i++){
            Sum = Sum - nums[i-1]+ nums[i-1+k];
            maxAverage = Math.max(maxAverage, (Sum/k));
        }
        return maxAverage;
    }
}
