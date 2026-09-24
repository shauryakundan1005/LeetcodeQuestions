class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int rev=0;
        if(num<0){return false;}
        while(num !=0){
            int rem = num %10;
            rev = rev*10 + rem;
            num = num/10;
        }
        if(rev == x){ return true;}
        System.out.println(rev);
        return false;
    }
}