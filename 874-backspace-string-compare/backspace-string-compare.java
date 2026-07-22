class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n = s.length();
        int m = t.length();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='#'){
                if(s1.length()>0){
                    s1.deleteCharAt(s1.length() - 1);
                }
            } else {
                s1.append(s.charAt(i));
            }
            i++;
        }
        int j=0;
       while(j<t.length()){
            if(t.charAt(j)=='#'){
                if(s2.length()>0){
                    s2.deleteCharAt(s2.length() - 1);
                }
            } else {
                s2.append(t.charAt(j));
            }
            j++;
       }
       return s1.toString().equals(s2.toString()); 
    }
}