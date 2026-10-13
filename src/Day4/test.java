class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fo = firstOccurance(nums, target);
        int lo = lastOccurance(nums, target);
        int[] arr = {fo,lo};
        return arr;
    }

    int firstOccurance(int[] nums, int target){
        int left =0; int right = nums.length-1;
        int res = -1;
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] < target){
                left = mid+1;
            }
            else if(nums[mid] > target){
                right = mid-1;
            }
            else{
                right = mid-1;
                res = mid;
            }
        }
        return res;
    }

    int lastOccurance(int[] nums, int target){
        int left =0; int right = nums.length-1;
        int res = -1;
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] > target){
                right=mid-1;
            }
            else if(nums[mid] < target){
                left = left+1;
            }
            else{
                left=mid+1;
                res = mid;
            }
        }
        return res;
    }
}