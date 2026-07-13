class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i =0, j=n-1;
        int res=-1;
        int min=Integer.MAX_VALUE;
        while(i<j){
            int num1= height[i];
            int num2= height[j];
            res = Math.max(res, Math.min(num1, num2) * (j -i));
             if(num1>num2){
                j--;
            } else {
                i++;
            }
        }
        return res;
    }
}