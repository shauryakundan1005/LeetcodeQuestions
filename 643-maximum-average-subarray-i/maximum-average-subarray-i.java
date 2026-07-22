class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int windowSum = 0;
        double max = Double.MIN_VALUE;
        for(int i = 0; i<k; i++){
            windowSum += nums[i];
        }
        max = windowSum;
        int low=0;
        for(int high=k; high<n; high++){
            windowSum -= nums[low];
            low++;
            windowSum += nums[high];
            max = Math.max(max, windowSum);
        }
        return (double) max/k;
    }
}