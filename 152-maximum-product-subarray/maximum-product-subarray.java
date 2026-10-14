class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if(n==1) {
            return nums[0];
        }
        int minbest = nums[0];
        int maxbest = nums[0];
        int max = nums[0];
        for(int i = 1; i<n; i++){
            int v1 = minbest * nums[i];
            int v2 = maxbest * nums[i];
            maxbest = Math.max(nums[i], Math.max(v1, v2));
            minbest = Math.min(nums[i], Math.min(v1, v2));
            max = Math.max(max, maxbest);
        }
        return max;
    }
}