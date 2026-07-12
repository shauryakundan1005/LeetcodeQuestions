class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i=0, j = n-1;
        int res[]= new int[n];
        while(i<=j){
            res[i] = (int)Math.pow(nums[i], 2);
            res[j] = (int)Math.pow(nums[j], 2);
            i++;
            j--;
        }
        Arrays.sort(res);
        return res;
    }
}