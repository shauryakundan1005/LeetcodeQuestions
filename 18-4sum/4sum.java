class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i< n-3; i++){
            for(int j= i+1; j<n-2; j++){
                int left = j+1;
                int right = n - 1;
                while(left<right){
                    long sum = (long) nums[i] + nums[j] +nums[left] +nums[right];
                    if(sum == target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[left]);
                        temp.add(nums[right]); 
                        if(!ans.contains(temp)){
                            ans.add(temp);
                        }
                        left++;
                        right--;
                    } else if(sum>target){
                        right--;
                    } else {left++;}
           
                }
            }
        }
        return ans;
    }
}