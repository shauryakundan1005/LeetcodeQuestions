class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        if(n==1) return Math.abs(nums[0]);
        int minbest=nums[0], maxbest=nums[0], max=Math.abs(nums[0]);
        for(int i =1; i<n;i++){
            maxbest = Math.max(nums[i], maxbest + nums[i]);
            minbest = Math.min(nums[i], minbest + nums[i]);
            
            max = Math.max(max, Math.max(maxbest, Math.abs(minbest)));
        }
        return max;
    }
}