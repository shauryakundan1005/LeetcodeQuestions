class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        if(n==1){return nums[0];}
        int totalSum=0, minbest=nums[0], maxbest=nums[0], max=nums[0], min=nums[0];

        for(int num:nums){
            totalSum += num;
        }
        for(int i = 1; i<n; i++){
            maxbest = Math.max(nums[i], maxbest+nums[i]);
            minbest = Math.min(nums[i], minbest+nums[i]);
            max = Math.max(max, maxbest);
            min = Math.min(min, minbest);
        }
        if(max<0) {return max;}
        return Math.max(max, totalSum - min);
    }
}