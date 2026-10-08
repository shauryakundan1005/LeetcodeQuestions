class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        while(n%3 ==0){
            n /= 3;
        }

        int pow = (int)(Math.log(n)/Math.log(3));
        return Math.pow(3, pow)==n;
    }
}