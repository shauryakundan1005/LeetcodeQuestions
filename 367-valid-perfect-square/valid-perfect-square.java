class Solution {
    public boolean isPerfectSquare(int num) {
        int low=0, high = num;
        while(low<=high){
            int mid = low + (high-low)/2;
            if((long)mid*mid == num){
                return true;
            } else if((long)mid*mid > num){
                high = mid -1;
            } else {
                low = mid +1;
            }
        }
        return false;
    }
}