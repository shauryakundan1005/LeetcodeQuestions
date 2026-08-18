class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length -1;
        int row=0, column = matrix[0].length -1;
        while(rows>=row && column>=0){
            if(matrix[row][column] == target){
                return true;
            } else if(matrix[row][column] > target){
                column--;
            } else {
                row++;
            }
        }
        return false;
    }
}