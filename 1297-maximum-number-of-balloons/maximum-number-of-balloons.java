class Solution {
    public int maxNumberOfBalloons(String text) {
        int n = text.length();
        String balloon = "balloon";
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> have = new HashMap<>();
        for(int i = 0; i<balloon.length(); i++){
            need.put(balloon.charAt(i), need.getOrDefault(balloon.charAt(i), 0)+1);
        }
        for(int j = 0; j<n; j++){
            have.put(text.charAt(j), have.getOrDefault(text.charAt(j), 0)+1);
        }
        int min = Integer.MAX_VALUE;
        for(char key: need.keySet()){
            if(have.containsKey(key)){
                 min = Math.min(min, (have.get(key) / need.get(key)));
            } else {
                return 0;
            }
        }
        return min;
    }
}