class Solution {
    private int findRow(int[][] matrix, int rows,int target){
        int low=0, high = rows -1, ans=-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(matrix[mid][0] == target){
                return mid;
            } else if(matrix[mid][0] < target) {
                ans = mid;
                low = mid +1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row = findRow(matrix, n, target);
        if(row==-1){return false;}
        int low=0, high= m-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(matrix[row][mid]==target){
                return true;
            } else if(matrix[row][mid]<target){
                low = mid+1;
            } else {
                high = mid -1;
            }
        }
        return false;
    }
}