class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){ return true; }
        int n = s.length();
        int i =0, count=0;
        for(int j=0; j<t.length(); j++){
            if(s.charAt(i) == t.charAt(j)){
                if(i<n-1){
                   i++;
                }
               
                count++;
            }
        }
        return count == n;
    }
}