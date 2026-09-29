class Triads {
    int x1;
    int y2;
    int dist;

    public Triads(int x, int y, int d){
        this.x1 = x;
        this.y2 = y;
        this.dist = d;
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
      int n = points.length;
      PriorityQueue<Triads> pq = new PriorityQueue<>(
        (a, b) -> {
            return Integer.compare(b.dist, a.dist);
        }
      );

      for(int i=0; i<n; i++){
        int res = (points[i][0]*points[i][0]) + (points[i][1] * points[i][1]);
        pq.add(new Triads(points[i][0], points[i][1], res));

        if(pq.size()>k){
            pq.poll();
        }
      }  
        List<int[]> ans = new ArrayList<>();

        while(!pq.isEmpty()){
            Triads td = pq.poll();
            int x1 = td.x1;
            int y2 = td.y2;
            ans.add(new int[]{x1, y2});
        }

    return ans.toArray(new int[0][]);

    }
}