class Pair{
    int num;
    int freq;
    public Pair(int n, int f){
        this.num = n;
        this.freq = f;
    }
}
class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> {
                if(a.freq != b.freq){
                    return Integer.compare(a.freq, b.freq);
                }
                return Integer.compare(a.num, b.num);
            }
        );

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();
            pq.add(new Pair(num, freq));
        }

        for(int i=0; i<k; i++){
            Pair p1 = pq.poll();
            int f = p1.freq - 1;
            if(f>0){
                pq.add(new Pair(p1.num, f));
            }
        }
        return pq.size();
    }
}