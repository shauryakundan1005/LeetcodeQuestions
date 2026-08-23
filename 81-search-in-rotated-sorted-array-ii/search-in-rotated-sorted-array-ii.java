class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return true;
            } 
            if(nums[mid]>nums[high]){
                if(nums[low]<= target && target<nums[mid]){
                    high = mid -1;
                } else {
                    low = mid +1;
                }
            } else if(nums[mid]<nums[high]) {
                if(nums[mid]<target && nums[high] >= target){
                    low = mid +1;
                } else {
                    high=mid -1;
                }
            } else {
                high--;
            }
        }
        return false;
    }
}