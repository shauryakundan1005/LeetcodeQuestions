class Solution {
    private int findSum(int[] nums, int divisor){
        int n = nums.length, sum = 0;
        for(int i = 0; i< n; i++){
            int dividend = nums[i]/divisor;
            if(nums[i] % divisor != 0){
                sum = sum + dividend +1;
            } else {
                sum += dividend;
            }
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int low=1, high= Integer.MIN_VALUE, res = -1;
        for(int i = 0; i < n; i++){
            high = Math.max(high, nums[i]);
        }
        while(low<=high){
            int mid = low + (high-low)/2;
            int divSum = findSum(nums, mid);
            if(divSum <= threshold){
                res = mid;
                high = mid -1;
            } else {
                low = mid +1;
            }
        }
        return res;
    }
}