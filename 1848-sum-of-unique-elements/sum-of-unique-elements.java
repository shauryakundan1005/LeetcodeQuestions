class Solution {
    public int sumOfUnique(int[] nums) {
        int n = nums.length;
        int  ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            if(val == 1){
                ans += key;
            }
        }
        return ans;
    }
}