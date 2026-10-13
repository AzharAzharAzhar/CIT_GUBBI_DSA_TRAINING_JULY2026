package Day5;
public class D5_LC209_Min_SubarrayLength {
    public static void main() {
        int[] a = {1, 3, 2, 4, 2, 6, 5, 4};
        System.out.println("Minimul Length of Sub Array is: "+ minLengthSubarray(a, 7));
    }
    public static int minLengthSubarray(int[] nums, int target){
        int n = nums.length; int minLength = 0;
        int Sum = 0; int left =0;

        for(int right=0; right < n; right++) {
            Sum += nums[right];

            while (Sum >= target) {
                Sum = Sum - nums[left];
                if (minLength == 0) {
                    minLength = right - left + 1;
                }
                else{
                    minLength = Math.min(minLength, (right-left +1));
                }
                left++;
            }
        }
        return minLength;
    }
}

