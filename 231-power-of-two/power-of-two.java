class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        int pow = (int)(Math.log(n)/Math.log(2));
        return Math.pow(2, pow) == n;
    }
}