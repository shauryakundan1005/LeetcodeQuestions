class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n!=m){ return false;}
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i=0; i<n;i++){
            char ch = s.charAt(i);
            char ch2 = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            map1.put(ch2, map1.getOrDefault(ch2, 0)+1);
        }
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            if (!map.get(s.charAt(i)).equals(map1.get(s.charAt(i)))) {
    return false;
}
        }
        return true;
    }
}