class Solution {
    public int[] searchRange(int[] nums, int target) {
      return new int[]{
        first(nums, target), last(nums, target)
      };
    }

    private int first(int nums[], int target){
        int low=0, high = nums.length-1, res = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                res = mid; 
                high = mid-1;
            } else if(nums[mid] < target){
                low = mid+1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }

    private int last(int nums[], int target){
        int low=0, high = nums.length-1, res = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                res = mid;
                low = mid+1;
            } else if(nums[mid] < target){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return res;
    }
}