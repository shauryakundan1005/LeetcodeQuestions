class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i<n; i++){
            pq.add(stones[i]);
        }

        while(!pq.isEmpty()){

            if(pq.size()==1){
                return pq.poll();
            }

            int stone1 = pq.poll();
            int stone2 = pq.poll();
            if(stone1 != stone2){
                pq.add(stone1-stone2);
            }
        }
        return 0;
    }
}