class Solution {
    public int maxSubArray(int[] nums) {
        int max= nums[0];
        int best = nums[0];
        for(int i = 1; i<nums.length; i++){
           best = Math.max(best + nums[i], nums[i]);
            max = Math.max(best, max);
        }
        return max;
    }
}