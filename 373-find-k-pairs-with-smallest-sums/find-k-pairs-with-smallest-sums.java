class Triads{
    int i;
    int j; 
    int sum;
    Triads(int i, int j, int sum){
        this.i =i;
        this.j =j;
        this.sum = sum;
    }
}

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        PriorityQueue<Triads> pq = new PriorityQueue<>(
            (a,b) -> { return Integer.compare(a.sum, b.sum); }
        );
        
        for(int i = 0; i<nums1.length; i++){
            pq.add(new Triads(i, 0, nums1[i]+nums2[0]));
        }

        while(k>0 & !pq.isEmpty()){
            Triads curr = pq.poll();

            ans.add(Arrays.asList(
                nums1[curr.i],
                nums2[curr.j]
            ));

            if(curr.j + 1 < nums2.length){
                pq.add(new Triads(
                    curr.i,
                    curr.j +1,
                    nums1[curr.i] + nums2[curr.j + 1]
                ));
            }
            k--;
        }
        return ans;
    }
}