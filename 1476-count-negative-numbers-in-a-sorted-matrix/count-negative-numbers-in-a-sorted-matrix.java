class Solution {
    public int countNegatives(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        for(int i = 0; i<n; i++){
           int low = 0, high = m-1; 
           while(low<=high){
            int mid = low + (high-low)/2;
            if(grid[i][mid] >= 0 ){
                low = mid +1;
            } else if(grid[i][mid] < 0){
                ans += high - mid + 1;
                high= mid -1;
            }
           }
        }
        return ans;
    }
}