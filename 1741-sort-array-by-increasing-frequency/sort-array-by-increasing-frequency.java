class Pair{
    int num;
    int freq;
    Pair(int num, int freq){
        this.num = num;
        this.freq = freq;
    }
}

class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap();
        for(int i = 0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> {
                if(a.freq!=b.freq)
                {return Integer.compare(a.freq, b.freq);}
                return Integer.compare(b.num, a.num);
            }
        );
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int freq = entry.getValue();

            pq.add(new Pair(key, freq));
        }

        int ans[] = new int[n];
        int pointer = 0;
        while(!pq.isEmpty()){
            Pair p1 = pq.poll();

            for(int i=0; i<p1.freq; i++){
                ans[pointer] = p1.num;
                pointer++;
            }
        }
        return ans;
    }
}