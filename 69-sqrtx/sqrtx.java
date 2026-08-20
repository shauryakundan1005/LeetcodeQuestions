class Solution {
    public int mySqrt(int x) {
        int low = 0, high = x, res = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if((long)mid * mid == x){
                return mid;
            } else if((long)mid*mid>x){
                high = mid-1;
            } else {
                res = mid;
                low = mid+1;
            }
        }
        return res;
    }
}