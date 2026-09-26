class Pair{
    char first; //character
    int second; // frequency 
    Pair(char f, int s){
        this.first = f;
        this.second = s;
    }
}

class Solution {
    public String reorganizeString(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0; i<n ; i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> {
                if(a.second != b.second){
                    return b.second - a.second;
                }
                return a.first - b.first;
            }
        );

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            char ch = entry.getKey();
            int freq = entry.getValue();
            pq.add(new Pair(ch, freq));
        }

        int seat = 0;
        String res = "";
        while(!pq.isEmpty()){
            Pair p1 = pq.poll();
            if(seat==0 || res.charAt(seat-1)!=p1.first){
                res = res + p1.first;
                seat++;
                p1.second--;
                if(p1.second>0){
                    pq.add(p1);
                }
            } else {
                if(pq.isEmpty()){
                    return "";
                } 
                Pair p2 = pq.poll();
                res = res + p2.first;
                seat++;
                p2.second--;
                if(p2.second>0){
                    pq.add(p2);
                }
                pq.add(p1);
            }
        }
        return res;
    }
}