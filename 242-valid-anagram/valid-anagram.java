class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n!=m){ return false;}
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<n;i++){
            char ch = s.charAt(i);
            char ch2 = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            map.put(ch2, map.getOrDefault(ch2, 0)-1);
        }
        for(int value: map.values()){
            if(value != 0){
                return false;
            }
        }
        return true;
    }
}