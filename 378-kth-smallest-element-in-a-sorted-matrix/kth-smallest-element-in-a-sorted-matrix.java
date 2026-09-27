class Triads {
    int val;
    int row;
    int col;
    Triads(int val, int row, int col){
        this.val = val;
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;
        int res[] = new int[n*m];
        PriorityQueue<Triads> pq = new PriorityQueue<>(
            (a, b) -> {return Integer.compare(a.val, b.val);}
        );
        for(int i =0; i<n; i++){
            pq.add(new Triads(matrix[i][0], i, 0));
        }
        int i =0, point=0;
        while(true){
            Triads p1 = pq.poll();
            int val = p1.val;
            int row = p1.row;
            int col = p1.col;
            res[point] = val;
            point++;
            if(col<m-1){
                pq.add(new Triads(matrix[row][col+1], row, col+1));
            }
            if(pq.isEmpty()){
                break;
            }
        }
        return res[k-1];
    }
}