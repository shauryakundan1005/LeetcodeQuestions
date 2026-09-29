class Pair {
    char ch;
    int freq;
    Pair(char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }
}

class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        } 

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> {
                if(a.freq != b.freq){
                    return Integer.compare(b.freq, a.freq);
                }
                return Character.compare(a.ch, b.ch);
            }
        );

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            char key = entry.getKey();
            int value = entry.getValue();
            pq.add(new Pair(key, value));
        }

        StringBuilder ans= new StringBuilder();
        while(!pq.isEmpty()){
            Pair p1 = pq.poll();
            for(int i=0; i<p1.freq; i++){
                ans.append(p1.ch);
            }
        } 
        return ans.toString();     
    }
}