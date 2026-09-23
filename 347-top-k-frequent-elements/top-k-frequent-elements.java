class Pair {
    int first;  // num
    int second; //freq
    Pair(int f, int s){
        this.first = f;
        this.second = s;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[k];

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> Integer.compare(a.second, b.second)
        );

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();

            pq.add(new Pair(num, freq));
            if(pq.size()>k){
                pq.poll();
            }
        }

        for(int i = 0; i<k; i++){
            ans[i] = pq.poll().first;
        }
        return ans;
    }
}