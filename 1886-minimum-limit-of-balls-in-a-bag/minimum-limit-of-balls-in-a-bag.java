class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int n = nums.length;
        int low=1, high=Integer.MIN_VALUE, res =-1;
        for(int i = 0; i<n; i++){
            high = Math.max(high, nums[i]);
        }
        while(low<=high){
            int mid = low + (high-low)/2;
            long totalOperations =0;

            for(int num: nums){
                totalOperations += (num-1)/mid;
            }
            if(totalOperations <= maxOperations){
                res = mid;
                high = mid -1;
            } else {
                low = mid +1;
            }
        }
        return res;
    }
}