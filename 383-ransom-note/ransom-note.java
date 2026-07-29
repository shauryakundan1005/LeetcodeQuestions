class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();
        int h = magazine.length();
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> have = new HashMap<>();
        for(int i = 0; i<n; i++){
            need.put(ransomNote.charAt(i), need.getOrDefault(ransomNote.charAt(i), 0)+1);
        }
        for(int j = 0; j<h; j++){
            have.put(magazine.charAt(j), have.getOrDefault(magazine.charAt(j), 0)+1);
        }
        for(char key: need.keySet()){
            if(have.containsKey(key) && have.get(key)>=need.get(key)){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}