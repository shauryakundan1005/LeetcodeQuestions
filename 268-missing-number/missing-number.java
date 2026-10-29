class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i<=n; i++){
            int low = 0, high = n-1;
            boolean check = false;
            while(low <= high){
                int mid = low + (high - low)/2;
                if(nums[mid] == i){
                    check = true;
                    break;
                }
                if(nums[mid] <i){
                    low = mid + 1;
                } else {
                    high = mid -1;
                }
            }
            if(!check){
                return i;
            } 
        }
        return -1;
    }
}